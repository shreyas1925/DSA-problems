import java.util.ArrayList;
import java.util.List;

public class MisMatch {

//	The problem states the there is a duplicate number and a missing number from 1 to n we have to return them both
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,2,4};
		
		List<Integer> ans = mismatchnumbers(arr);
		
		System.out.println(ans);
		
		
	}
	
	static List<Integer> mismatchnumbers(int[] arr){
		
		List<Integer> ans = new ArrayList<>();
		
		int i=0;
		
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr,i,correct);
			}else {
				i++;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(j!=arr[j]-1) {
				ans.add(j+1);
				ans.add(arr[j]);
			}
		}
		
		return ans;
	}
	
	static void swap(int[] arr,int first,int second) {
		int temp = arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}


}
