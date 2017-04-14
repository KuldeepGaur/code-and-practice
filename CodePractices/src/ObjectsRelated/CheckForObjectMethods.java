package ObjectsRelated;

/**
 * Created by AMIT on 09-07-2016.
 */
public class CheckForObjectMethods {

    public static void main(String []args){

        /**
         * in java if the String already available in the jvm then the String is assigned the same hash code either
         * it is string or the String Buffer or the string builder
         *
         *
         * it's not neccessary that the value of two hashcode can't be same in other words two hashcode values can be
         * equal.
         *
         *
         * it is not guarenteed that if two objects are varified through the equals would have the same hash code
         * but it wold be the good practice that two objects have the distinct hash code if they are not equal()
         * this would help for the hashing of the objects when they are used in some collections as in hashtable in hashmap etc....
         */

        String str="test",str1="test";
        StringBuffer strBuffer=new StringBuffer("test"),
                     strBuffer1=new StringBuffer("test1");

        StringBuilder stringBuilder=new StringBuilder("test");
        System.out.println("by == for String and String of same value is " + str == str1);
        System.out.println("by equals() for String and String "+str.equals(str1));
        System.out.println("this is by == for String and String Buffer "+str==strBuffer.toString());
        System.out.println("this is by equals for String and String Buffer "+str.equals(strBuffer.toString()));
        System.out.println("this is by ha for String and String Buffer "+(str.hashCode()==strBuffer.toString().hashCode()));
        System.out.println(" "+str.hashCode()+" and for hash code is here  "+strBuffer.toString().hashCode());
        System.out.println("this is by ha for String and String builder "+(str.hashCode()==stringBuilder.toString().hashCode()));
        System.out.println(" "+str.hashCode()+" and for hash code is here  "+stringBuilder.toString().hashCode());
        System.out.println("this is by ha for String Buffer and String Buffer-------- "+(strBuffer.toString().hashCode()==strBuffer1.toString().hashCode()));
        System.out.println(" "+str.hashCode()+" and for hash code is here  "+strBuffer.toString().hashCode());
        System.out.println("this is by ha for String and String builder "+(str.hashCode()==stringBuilder.toString().hashCode()));
        System.out.println(" "+str.hashCode()+" and for hash code is here  "+stringBuilder.toString().hashCode());
    }
}
