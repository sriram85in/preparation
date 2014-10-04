package arrays;

public class MaximumSubArray {
	
	public static void main(String [] args) {
		int input[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSubArray(input));
	}
	
	public static int maxSubArray(int [] input) {
		int maxElement = input[0];
		int maxSoFar = input[0];
		for(int i =1; i < input.length;i++) {
			maxElement = Math.max(input[i], maxElement+input[i]);
			maxSoFar = Math.max(maxElement, maxSoFar);
		}
		return maxSoFar;
	}
}
