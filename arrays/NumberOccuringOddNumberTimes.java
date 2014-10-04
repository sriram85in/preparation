package arrays;

/*
 * Find the Number Occurring Odd Number of Times
 * 
 * http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
 */

public class NumberOccuringOddNumberTimes {
	public static void main(String [] args) {
		int input[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		System.out.println(numberOddNumberTimes(input));
	}
	public static int numberOddNumberTimes(int [] input) {
		int result = 0;
		for(int i =0 ; i < input.length;i++) {
			result = result ^ input[i];
		}
		
		return result;
	}
}
