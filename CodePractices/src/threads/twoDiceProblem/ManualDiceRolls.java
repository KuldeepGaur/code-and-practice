package threads.twoDiceProblem;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutionException;

/**
 * Created by AMIT on 24-07-2016.
 */
    public class ManualDiceRolls {
        private static final int N = 100000000;
        private final double fraction;
        private final Map<Integer, Double> results;
        private final int numberOfThreads;
        private final ExecutorService executor;
        private final int workPerThread;
        public static void main(String[] args) {
            ManualDiceRolls roles = new ManualDiceRolls();
            roles.simulateDiceRoles();
        }
        public ManualDiceRolls() {
            fraction = 1.0 / N;
            results = new ConcurrentHashMap<>();
            numberOfThreads = Runtime.getRuntime().availableProcessors();
            System.out.println("hi "+numberOfThreads);
            executor = Executors.newFixedThreadPool(numberOfThreads);
            workPerThread = N / numberOfThreads;
        }
        public void simulateDiceRoles() {
            List<Future<?>> futures = submitJobs();
            awaitCompletion(futures);
            printResults();
        }
        private void printResults() {
            results.entrySet()
                    .forEach(System.out::println);
        }
        private List<Future<?>> submitJobs() {
            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < numberOfThreads; i++) {
                futures.add(executor.submit(makeJob()));
            }
            return futures;
        }
        private Runnable makeJob() {
            return () -> {
                ThreadLocalRandom random = ThreadLocalRandom.current();
                for (int i = 0; i < workPerThread; i++) {
                    int entry = twoDiceThrows(random);
                    accumulateResult(entry);
                }
            };
        }
        private void accumulateResult(int entry) {
            results.compute(entry, (key, previous) ->
                    previous == null ? fraction
                            : previous + fraction
            );
        }
        private int twoDiceThrows(ThreadLocalRandom random) {
            int firstThrow = random.nextInt(1, 7);
            int secondThrow = random.nextInt(1, 7);
            return firstThrow + secondThrow;
        }
        private void awaitCompletion(List<Future<?>> futures) {
            futures.forEach((future) -> {
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
        }
    }
