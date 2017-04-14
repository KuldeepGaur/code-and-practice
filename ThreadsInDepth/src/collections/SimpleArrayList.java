package collections;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SimpleArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count=0;
		long startTime=System.currentTimeMillis();
		args=new String [] {"F:/c/user/amit/Desktop/tutorial/tutorial/collections/interfaces/examples/dictionary.txt"};

        ArrayList<String> listOfWords=new ArrayList();
        
        try {
            Scanner s = new Scanner(new File(args[0]));
            while (s.hasNext()) {
            	String word = s.next();
            	if(word!=null && word.startsWith("test") && word.length()==5){
            		listOfWords.add(word);
            		count ++;
            	}
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        } finally{
        	long endTime=System.currentTimeMillis();
        	if(listOfWords!=null && listOfWords.size()>0){
        		System.out.println("list size is "+listOfWords.size()+" and the time taken is "+(endTime-startTime) +"mili seconds");
        		System.out.println("and total words are "+count);
        	}
        	
        	for(String str:listOfWords){
        		System.out.println(str);
        	}
        	
        }


	}

}
