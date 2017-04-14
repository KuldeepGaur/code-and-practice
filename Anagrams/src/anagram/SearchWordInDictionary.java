package anagram;

import java.util.Scanner;

public class SearchWordInDictionary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hi there this program gets the input from the user and search this in the dictionary");
		getTheInputAndPrint();
	}

	public static void getTheInputAndPrint(){
		System.out.println("hi there the input is here ");
		Scanner sc=new Scanner(System.in);
		if(sc.hasNext()){
			System.out.println("input is"+sc.next());
		}
		getTheInputAndPrint();
	}
}
