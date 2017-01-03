import java.util.Arrays;

public class Solution1 {
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		int[] result = twoSum(new int[] {2, 7, 11, 15}, 22);
		System.out.println(Arrays.toString(result));
	}

}
