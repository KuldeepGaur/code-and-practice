package collectionInsertionOrderTest;

import java.util.HashMap;
import java.util.Random;

public class HashMapTest {

    public static void main(String[] args) {
        TestHashmap testHashmap = new TestHashmap(20);
        TestHashmap testHashmap2 = new TestHashmap(20);
        TestHashmap testHashmap3 = new TestHashmap(20);
        TestHashmap testHashmap4 = new TestHashmap(20);

        HashMap <TestHashmap,TestHashmapValue> hashmap= new HashMap<TestHashmap,TestHashmapValue>();

        System.out.println("testHashmap2.equals(testHashmap) ------- >>>>>>>>>>>>>>>>>>>>  "+testHashmap2.equals(testHashmap) + "and by == operator if we check this this shoul be like "+ (testHashmap2==testHashmap));
        System.out.println("testHashmap3.equals(testHashmap2) ----->>>>>>>>>>>>>>>>>>>>  "+testHashmap3.equals(testHashmap2) + "and by == operator if we check this this shoul be like "+ (testHashmap3==testHashmap2));
        System.out.println("testHashmap4.equals(testHashmap3)----->>>>>>>>>>>>>>>>>>>>  "+testHashmap4.equals(testHashmap3)+ "and by == operator if we check this this shoul be like "+ (testHashmap4==testHashmap3));

        hashmap.put(testHashmap,new TestHashmapValue(50));
        hashmap.put(testHashmap2,new TestHashmapValue(100));
        hashmap.put(testHashmap3,new TestHashmapValue(70));
        hashmap.put(testHashmap4,new TestHashmapValue(60));
        hashmap.put(testHashmap4,new TestHashmapValue(60));

        System.out.println(hashmap);
    }
}

class TestHashmap{
    int hashNo=0;

    public TestHashmap(int hashNo) {
        this.hashNo = hashNo;
    }

    @Override
    public int hashCode() {
        /*Random r = new Random();
        return r.nextInt();*/
        return this.hashNo;
    }

    @Override
    public String toString() {
        return "TestHashmap{" +
                "hashNo=" + hashNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestHashmap)) return false;

        /*TestHashmap that = (TestHashmap) o;

        return hashNo == that.hashNo;*/
        return  false;

    }
}

class TestHashmapValue{
    int hashNo=0;

    public TestHashmapValue(int hashNo) {
        this.hashNo = hashNo;
    }

    @Override
    public String toString() {
        return "TestHashmapValue{" +
                "hashNo=" + hashNo +
                '}';
    }
}