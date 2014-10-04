package arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String [] args) {
		int [] input = {1,2,3,4,5};
		reverse(input);
		System.out.println(Arrays.toString(input));
		int [] input1 = {1,2,3,4,5,6};
		reverse(input1);
		System.out.println(Arrays.toString(input1));
	}
	public static void reverse(int [] input) {
		int start = 0 ; 
		int end = input.length-1;
		while(start < end) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start ++;
			end--;
		}
	}
}
