import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		 int[] nums1 = {1,2,3,0,0,0};
		 int m = 3;
		 int[] nums2 = {2,5,6};
		 int n = 3;
		 merge(nums1,m,nums2,n);
	}
	
	 static void merge(int[] nums1, int m, int[] nums2, int n) {
	        for(int i=0;i<n;i++){
	           
                nums1[i+3]=nums2[i];
	        	 
	        }
	    
	       bubblesort(nums1);
	       
	       System.out.println(Arrays.toString(nums1));	       
	        
	    }
	 
	 
	 static void bubblesort(int[] nums) {
		 
		 for(int i=0;i<nums.length;i++) {
			 for(int j=1;j<nums.length-i;j++) {
				 
				 if(nums[j] < nums[j-1]) {
					 int temp=nums[j];
					 nums[j]=nums[j-1];
					 nums[j-1]=temp;
				 }
				 
			 }
		 }
		 
		 
	 }
	 
	 
}
