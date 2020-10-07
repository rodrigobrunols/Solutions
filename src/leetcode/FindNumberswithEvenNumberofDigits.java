package leetcode;

public class FindNumberswithEvenNumberofDigits {

	private boolean isEven(String number) {
		return number.length() % 2 == 0;
	}

	public int findNumbers(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (isEven(nums[i] + "")) {
				count++;
			}
		}

		return count;

	}

	
	public static void main(int[] args) {
		FindNumberswithEvenNumberofDigits findNumber = new FindNumberswithEvenNumberofDigits();
		System.out.println(findNumber.findNumbers(args));
	}
}
