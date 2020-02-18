
/*
 * Given an array of Integers, return the indices of the two numbers such as they add up to the specified target.  
 * You may assume that each input would have exactly ONE solution,
 * and you may NOT use the same input TWICE.
 * 
 * For Example, Given nums = [2,7,11,15], target = 9
 * return [0,1]
 */

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 8, 7, 13, 21 };

		System.out.println("Generating an array of Integers: " + Arrays.toString(nums));

		int target = 15;

		System.out.println("Setting target sum of indices as: " + target);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			Integer y = (Integer) (target - nums[i]);

			if (hm.containsKey(y)) {

				int nums2[] = { hm.get(y), i};

				System.out.println(Arrays.toString(nums2));
				
			}

			hm.put(nums[i], i);
		}

	}
}
