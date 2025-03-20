package practice;

import java.util.Arrays;

/*Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};*/
public class Challenge1 {
	public void getProccesedArray(int[] nums) {
		int[] newArrya = new int[nums.length];
		for(int i = 0 ; i<nums.length ; i++) {
			int sum = 0 ;
			for(int j = 0 ; j<nums.length ; j++) {
				if(j!=i) {
					sum = sum + nums[j];
				}
			}
			newArrya[i] = sum;
		}
		System.out.println(Arrays.toString(newArrya));
	}
	
	public static void main(String[] args) {
		Challenge1 challenge1 = new Challenge1();
		int[] nums = {3, 5, 7, 1, 9};
		System.out.println("input array is \n" +Arrays.toString(nums) +"\n");
		challenge1.getProccesedArray(nums);
	}
}
