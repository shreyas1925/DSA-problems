import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {0,2,1,4};
		int ans = cyclicsort(arr);
//		System.out.println(Arrays.toString(arr));
		System.out.println(ans);
	}
	
	static int cyclicsort(int[] arr) {
		int i=0;
		
		while(i<arr.length) {
			int actualindex = arr[i];
//			Because numbers are starting from 0 itself which is same as the starting index
			if(arr[i] < arr.length && arr[i]!=arr[actualindex]) {
				swap(arr,i,actualindex);
			}else {
				i++;
			}
		}
		
//		Here we can find our missing number
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]!=j) {
				return j;
			}
			
		}
		
//		If we have n in our 
		return arr.length;
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
