package practice;

import java.util.Arrays;

public class PraccClass1 {
	void printWord() {
		System.out.print("Hello, its my 1st commit in new branch under new repo");
	}
	
	public static void main(String[] args) {
		PraccClass1  praccClass1 = new PraccClass1();
		praccClass1.printWord();
		System.out.println("My 1st commit edited");
		System.out.println("2nd commit");
		System.out.println("3rd commit");
		int[] num = {5,3,4,8,0,9}; 
		Arrays.sort(num);
		System.out.println(num[num.length -1]);
		}
	 
	}

