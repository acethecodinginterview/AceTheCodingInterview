public class Solution2 {

	public static int maxSubArray(int[] nums) {
		if(nums.length == 0) return 0;

		int prev = nums[0];
		int bestSeenValue = nums[0];

		for(int i = 1; i < nums.length; i++)
		{
			prev = prev > 0 ? nums[i] + prev : nums[i];
			bestSeenValue = Math.max(bestSeenValue, prev);
		}

		return bestSeenValue;
	}


	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
