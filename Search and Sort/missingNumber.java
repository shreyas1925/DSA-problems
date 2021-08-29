import java.util.Arrays;

public class missingNumber {

	public static void main(String[] args) {
		
//		int[] nums = {9,6,4,2,3,5,7,0,1};
		int[] nums = {3,0,1};
		
		Arrays.sort(nums);
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]+1) {
				continue;
			}else {
				System.out.println(nums[i]-1);
			}
		}
		
	}
	
}
