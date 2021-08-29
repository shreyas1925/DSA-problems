import java.util.Arrays;

public class SortingBasic {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,5,1};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void cyclicsort(int[] arr) {
		
		int i=0;
		
		while(i<arr.length) {
			int actualindex = arr[i]-1;
			
			if(arr[i]!=arr[actualindex]) {
				swap(arr,i,actualindex);
			}else {
				i++;
			}
		}
		
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
}
