public class Solution1 {

	public static int maxSubArray(int[] nums) {
		if(nums.length == 0) return 0;

		int bestSeen = nums[0];
		int runningTotal;

		for(int i = 0; i < nums.length; i++)
		{
			runningTotal = nums[i];
			for(int j = i + 1; j < nums.length; j++)
			{
				runningTotal += nums[j];
				if(runningTotal > bestSeen) bestSeen = runningTotal;
			}
		}

		return bestSeen;
	}

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}

}
