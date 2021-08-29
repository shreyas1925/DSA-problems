import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MissingElements {

	public static void main(String[] args) {
		int[] arr = {1,3};
		List<Integer> ans = missingelement(arr);
		System.out.println(ans);
	}
	
	static List<Integer> missingelement(int[] arr) {
		int i=0;
		
		while(i<arr.length) {
			int correctindex = arr[i]-1;
			
			if(arr[i] < arr.length && arr[i]!=arr[correctindex]) {
				swap(arr,i,correctindex);
			}else {
				i++;
			}
		}

		List<Integer> ans = new ArrayList<>();
		
		for(int j=0;j<arr.length;j++) {
			 if(j!=arr[j]-1){
				ans.add(j+1); //finding the missing number not the index so j+1
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
