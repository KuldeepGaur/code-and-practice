package collections.HashMapImplementation;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by AMIT on 12-07-2016.
 */
public class HashMapWithNullKey{
    public static void main(String[] args) {
        System.out.println("hi there this is the simple class which checks for the null key insertion on the map");

        insertNullKeys();
    }
    public static void insertNullKeys(){
        HashMap testHashMap = new HashMap();
        testHashMap.put("test","test value");
        testHashMap.put("test1","test1 value");
        testHashMap.put("test2","test2 value");
        testHashMap.put(null,null);
        testHashMap.put("test3","test3 value");

        System.out.println(testHashMap.toString());

    }

}
