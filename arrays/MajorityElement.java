package arrays;

/*
 * Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:

       I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4 

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE
       
       http://www.geeksforgeeks.org/majority-element/
 */
public class MajorityElement {
	
	public static void main(String [] args) {
		int input[] = {1, 3, 3, 1, 2};
		System.out.println(findMajority(input));
		int input1[] = {1, 3, 3, 1, 3};
		System.out.println(findMajority(input1));
	}
	public static int findMajority(int [] input) {
		int predictedMajority = findPredictedMajority(input);
		int count =0;
		for(int i =0 ;i < input.length ;i++) {
			if(input[i] == predictedMajority) {
				count ++;
			}
		}
		if(count > input.length/2) {
			return predictedMajority;
		} else {
			return Integer.MIN_VALUE;
		}
	}

	private static int findPredictedMajority(int[] input) {
		int majorityIndex =0;
		int count = 1;
		for (int i =1 ; i < input.length ;i++) {
			if(input[i] == input[majorityIndex]) {
				count ++;
			} else {
				count --;
			}
			
			if(count ==0) {
				majorityIndex =i;
				count =1;
			}
		}
		
		return input[majorityIndex];
	}
}
