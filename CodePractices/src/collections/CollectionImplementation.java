package collections;

import java.util.*;

/**
 * Created by AMIT on 10-07-2016.
 */
public class CollectionImplementation {
    public static void main(String[] args) {
        HashMap testMap=new HashMap();
        Hashtable testHashHashtable = new Hashtable();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        //testHashHashtable.put(null,"test Null in hashTable");
        testMap.put(null,"nullValue");
        testMap.put(null,"nullValue2");
        linkedHashMap.put(null,"test ");
        System.out.println(testMap.toString()+" test this ");
        System.out.println(testHashHashtable.toString()+" test this ");
        System.out.println(linkedHashMap.toString()+" test this linked hash map");
        testMap.get(null);

        System.out.println("callig the listImplementation");
        listImplementation();
        System.out.println("callig the setImplementation");
        setImplementation();
        System.out.println("callig the mapImplementation");
        mapImpletation();
    }

    public static void listImplementation(){

        ArrayList arrayList=new ArrayList();
        Vector vector=new Vector();
        LinkedList linkedList=new LinkedList();

        arrayList.add("test");
        arrayList.add(0,"test2");
        vector.add("test");
        vector.add(0,"test2");
        linkedList.addFirst("test0");
        linkedList.addLast("test");
        arrayList.stream().forEach(e -> System.out.println(e.toString()));
        vector.stream().forEach(e -> System.out.println(e.toString()));
        linkedList.stream().forEach(e -> System.out.println(e.toString()));
    }

    public static void setImplementation(){

        HashSet hashSet=new HashSet();
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        TreeSet treeSet=new TreeSet();

        hashSet.add("test");
        hashSet.add("test1");
        linkedHashSet.add(hashSet);
        //treeSet.add(hashSet);

        System.out.println("hi there hashset is here");
        hashSet.stream().forEach(e-> System.out.println(e.toString()));
        System.out.println("hi there linked Hash set is here");
        linkedHashSet.stream().forEach(e-> System.out.println(e.toString()));
        System.out.println("hi there tree Hash set is here");
        treeSet.stream().forEach(e-> System.out.println(e.toString()));
    }

    public static void mapImpletation(){

        HashMap hashMap=new HashMap();
        LinkedHashMap  linkedHashMap=new LinkedHashMap();
        TreeMap treeMap=new TreeMap();


        hashMap.put("0","test0");
        hashMap.put("1","test1");
        linkedHashMap.putAll(hashMap);
        //treeMap.putAll(hashMap);

        System.out.println(hashMap.toString());
        System.out.println(linkedHashMap.toString());
        System.out.println(treeMap.toString());
    }
}
