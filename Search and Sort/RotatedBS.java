
public class RotatedBS {

	public static void main(String[] args) {
		
		int[] nums = {4,5,7,9,2,4};
//		int[] nums = {2,9,2,2,2};
		
		System.out.println(search(nums,3));
		
		
	}
	
	static int search(int[] nums,int target) {
		
		int pivot = findPivot(nums);
		
//		If no pivot found just do the normal binary search
		
		if(pivot==-1) {
			return binarySearch(nums,target,0,nums.length-1);
		}
		
		if(target==nums[pivot]) {
			return pivot;
		}
		
		if(target >=nums[0]) {
			return binarySearch(nums,target,0,pivot-1);
		}
		
		return binarySearch(nums,target,pivot+1,nums.length-1);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

	
	
	
//	Main Reason why to find the pivot 
//	yake andre rotated array li naav pivot find madidre namge left and right erad ascending array sigutte
//	amele adru mele naavu binary search hakuke agutte
	
	static int findPivot(int[] nums) {
		
		int start=0;
		int end=nums.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
//			Here there is chances of out of bound cases so we will be checking with && operator
			
			if(mid<end && nums[mid]>nums[mid+1]) {
				return mid;
			}
			if(mid > start && nums[mid]<nums[mid-1]) {
				return mid-1;
			}
			
			if(nums[mid] <= nums[start]) {
				end=mid-1;
			}
//			if(start < nums[mid]) {
			else {
				start=mid+1;
//				we can think adhu mid left alle erabahudh but start kinta jaste erbahudh
//				anta but hange agidre first 2 steps alle adhu namge return agirtittu
			}
			
		}
		
		
		
		return -1;
	}
	
}
