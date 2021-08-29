import java.util.Iterator;

public class DuplicateNumber {

	
	public static void main(String[] args) {
		
		int[] nums = {1,1,2,2};
		int ans = cyclicsort(nums);
		System.out.println(ans);
	}
	
	
	static int cyclicsort(int[] nums) {
	
		int i=0;
		
		while(i<nums.length) {
			int correct = nums[i]-1;
			
			if(nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}else {
				i++;
			}
		}
		
		for (int j = 0; j < nums.length; j++) {
			if(j!=nums[j]-1) {
				return nums[j];
			}
		}
		
		
		
		return -1;
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	

	

}
