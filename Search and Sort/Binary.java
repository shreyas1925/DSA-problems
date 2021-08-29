
public class Binary {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,8,12,18,24,29,30,78};
		int target=18;
		System.out.println("hello");
		int ans = OrderAgnosticsBS(arr,target);
		System.out.println(ans);
	}
	
	static int OrderAgnosticsBS(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc;
		
		if(start<=end) {
			isAsc=true;
		}else {
			isAsc=false;
		}
		
	
	
		
		while(start<=end) {
			int mid = start+ (end-start)/2;
			
		if(arr[mid]==target) {
				return mid;
		}
		
		if(isAsc) {
			if(arr[mid] > target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}else {
			if(arr[mid] < target) {
				end=mid-1;
			}else {
				start = mid- 1;
			}
		}
	
	}
		return -1;
	}

}
