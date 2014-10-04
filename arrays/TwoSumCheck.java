package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * 
 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 */
public class TwoSumCheck {
	
	public static void main(String [] args) {
		 int input[] = {1, 4, 45, 6, 10, -8};
		 int sum = 16;
		 System.out.println(checkSumPairs(input, sum));
		 System.out.println(checkSumHashMap(input, sum));
		 sum = 17;
		 System.out.println(checkSumPairs(input, sum));
		 System.out.println(checkSumHashMap(input, sum));
	}
	
	/*
	 * Complexity: O(nlogn)
	 */
	public static boolean checkSumPairs(int [] input,int sum) {
		Arrays.sort(input);
		int left = 0;
		int right = input.length-1;
		while(left < right) {
			if(input[left] + input[right] == sum) {
				return true;
			} else if(input[left]+input[right] > sum) {
				right--;
			} else {
				left++;
			}
		}
		
		return false;
	}
	
	/*
	 * Complexity: O(n)
	 */
	public static boolean checkSumHashMap(int [] input, int sum) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0 ; i < input.length;i++) {
			if(map.containsKey(sum - input[i])) {
				return true;
			} else {
				map.put(input[i], 1);
			}
		}
		return false;
	}
}
