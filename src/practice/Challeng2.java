package practice;

import java.util.Arrays;

/*Challenge - 2: Given an array of strings, 
 * reverse each string in the array only if the string 
 * contains more than one vowel (a, e, i, o, u). The resulting array 
 * should reflect the modifications.
Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};*/
public class Challeng2 {

	public void getProccessedArray(String names[]) {
		String[] outputArray = new String[names.length];
		for(int i = 0 ; i<names.length ; i++) {
			outputArray [i] = checkifVovelsPresent(names[i]);
		}
		
		System.out.println("Output Array is: \n" +Arrays.toString(outputArray));
	}
	
	public String reverseString(String input) {
		String word = "";
		for(int i = input.length()-1 ; i>= 0 ; i--) {
			word = word + input.charAt(i);
		}
		
		return word;
	}
	
	public String checkifVovelsPresent(String text) {
		int count = 0 ;
		for(int i = 0 ; i<text.length() ; i++) {
			char ch = text.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ) {
				count++;
			}
		}	
		if(count>1) {
			return reverseString(text);
		}
		return text;
	}

	public static void main(String[] args) {
		Challeng2 challeng2 = new Challeng2();
		String [] names = {"apple", "sky", "orange", "try", "eagle"};
		System.out.println("input array is: \n" +Arrays.toString(names) +"\n");
		challeng2.getProccessedArray(names);
	}

}
