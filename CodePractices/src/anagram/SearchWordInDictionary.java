package anagram;

import util.StringsUtil;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class SearchWordInDictionary {

    static HashSet dictionaryHashSet=setTheDicionaryMap("F:/c/user/amit/Desktop/tutorial/tutorial/collections/interfaces/examples/dictionary.txt");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        System.out.println("hi there this program gets the input from the user and search this in the dictionary");
        //HashSet dictionaryHashSet=setTheDicionaryMap("F:/c/Users/AMIT/workspace/CodePractices/src/filesForPractice/dictionary.txt");
        /*if(dictionaryHashSet!=null && dictionaryHashSet.size()>0){
            dictionaryHashSet.stream().forEach(e -> System.out.println(e.toString()));
        }*/
        getTheInputAndPrintIfWordExistInDictionary();
    }

	public static void getTheInputAndPrintIfWordExistInDictionary(){
		System.out.println("\nhi please input the word to be search in the dictionary");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			String input=sc.next();
			if(StringsUtil.isValid(input)){
			    if(dictionaryHashSet.contains(input)){
                    System.out.println("hi this exist in the dictionary");
                } else {
                    System.out.println("hi this does't exist");
                }
			}
		}
        getTheInputAndPrintIfWordExistInDictionary();
	}

    public static HashSet setTheDicionaryMap(String filePath){

        if(StringsUtil.isValid(filePath)){
            HashSet dictionarySet=new HashSet();
            try {
                Scanner s = new Scanner(new File(filePath));
                while(s.hasNext()){
                    dictionarySet.add(s.next());
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return dictionarySet;
        } else {
            return null;
        }

    }
}
