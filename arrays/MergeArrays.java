package arrays;

import java.util.Arrays;

/*
 * Merge an array of size n into another array of size m+n
 * 
 * http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
 */
public class MergeArrays {
	
	public static void main(String [] args) {
		Integer large[] = {2, 8, null,null, null, 13,null, 15, 20};
		Integer small[] = {5, 7, 9, 25};
		mergeArrays(small, large);
		System.out.println(Arrays.toString(large));
	}

	public static void mergeArrays(Integer[] small,Integer [] large) {
		//first move all elements to last in large array
		rearrangeArray(large);
		int startingIndex = findStartingNonNullIndex(large);
		merge(small,large,startingIndex);
	}

	private static void merge(Integer[] small, Integer[] large,
			int startingIndex) {
		int startSmallIndex = 0;
		int startLargeIndex = startingIndex;
		int startResultIndex = 0;
		while(startLargeIndex < large.length && startSmallIndex < small.length) {
			if(large[startLargeIndex] > small[startSmallIndex]) {
				large[startResultIndex++] = small[startSmallIndex++];
			} else if (large[startLargeIndex] < small[startSmallIndex]) {
				large[startResultIndex++] = large[startLargeIndex++];
			} else {
				large[startResultIndex++] = small[startSmallIndex++];
				large[startResultIndex++] = large[startLargeIndex++];
			}
		}
		
		while(startSmallIndex < small.length) {
			large[startResultIndex++] = small[startSmallIndex++];
		}
		
		while(startLargeIndex < large.length) {
			large[startResultIndex++] = large[startLargeIndex++];
		}
		
	}

	private static int findStartingNonNullIndex(Integer[] large) {
		for(int i = large.length-1;i >=0 ;i--) {
			if(large[i] == null) {
				return i+1;
			}
		}
		
		return large.length;
	}

	private static void rearrangeArray(Integer[] large) {
		int tobeFilled = large.length-1;
		for(int i = large.length-1 ; i >=0 ;i--) {
			if(large[i] != null) {
				large[tobeFilled] = large[i];
				tobeFilled--;
			}
		}
	}
}
