import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,4,1,2,3};
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int getMaxIndex = getmax(arr,0,last);
			swap(arr,getMaxIndex,last);
		}
	}
	
	
	static void swap(int[] arr,int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
	static int getmax(int[] arr,int start,int end) {
		int max=start;
		
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		
		return max;
		
	}

}