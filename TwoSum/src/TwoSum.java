/*
 * Given an array of Integers, return the indices of the two numbers such as they add up to the specified target.  
 * You may assume that each input would have exactly ONE solution,
 * and you may NOT use the same input TWICE.
 * 
 * For Example, Given nums = [2,7,11,15], target = 9
 * return [0,1]
 */
public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 2, 8, 7, 13, 21 };

		int[] nums2 = {};

		int target = 15;

		int x = 0;

		int y = 0;

		{

			for (int i = 0; i < nums.length; i++) {

				x = nums[i];

				if (nums[i] < target) {

					y = target - x;

					nums2[i] = nums[i];

					for (int j = 0; j < nums.length; j++) {

						if (nums[j] == y) {

							nums2[j] = nums[j];

							System.out.println(j + nums2[j]);
						}
					}

				}
			}
		}
	}
}