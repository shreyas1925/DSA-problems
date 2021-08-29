package main;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		int[] nums = {12,4254,8965,124};
		System.out.println(findNumbers(nums));
	}
	
	static int findNumbers(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(even(nums[i])) {
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num) {
		
		int evennumberdigits = digits(num);
		
		if(evennumberdigits%2==0) {
			return true;
		}
		return false;
		
	}
	
	static int digits(int num) {
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}
