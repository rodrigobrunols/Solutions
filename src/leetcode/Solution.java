package leetcode;
public class Solution {

	
	public static int findMaxConsetutiveOnes(int[] nums) {
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]== 1) {
				count++;
				if(count > maxCount)
					maxCount = count;
			}else {
				count = 0;
			}
		}
		
		return maxCount;
	}
	
	public static void main(String[] args) {
//		int[] entrada = {1,1,0,1,1,1};
		int[] entrada = {1,0,1,1,0,1};
		
		System.out.println(findMaxConsetutiveOnes(entrada));
	}
}
