package JavaDesignPatterns.src.com.designPatterns.singleton;

import java.io.*;

/**
 * Created by KULDEEP on 20-08-2016.
 */
public class SingletonSeralizedTest {
    public static void main(String[] args) throws FileNotFoundException, IOException,ClassNotFoundException {

        SingletonWithSerialization instanceOne= SingletonWithSerialization.getInstance();
        ObjectOutput out= new ObjectOutputStream(new FileOutputStream("F:/c/user/amit/Desktop/test.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("F:/c/user/amit/Desktop/test.ser"));
        SingletonWithSerialization instanceTwo = (SingletonWithSerialization) in.readObject();
        in.close();

        System.out.println("instance one hashcode="+instanceOne.hashCode());
        System.out.println("instance one hashcode="+instanceTwo.hashCode());
    }
}
