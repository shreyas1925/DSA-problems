package main;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {12,1,4,85,197,25,97};
		int key=96;
		boolean ans=linearSearch(nums,key);
        System.out.println(ans);
	}
	
	static boolean linearSearch(int[] nums,int key) {
		
		if(nums.length==0) {
			return false;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==key) {
				return true;
			}
		}
		
		
		return false;
	}
	
}
