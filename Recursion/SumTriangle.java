import java.util.Arrays;

//Given an array of integers, print a sum triangle
//from it such that the first level has all array 
//elements. From then, at each level number of elements
//is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level

public class SumTriangle {

	public static void main(String[] args) {
		int[] array = {2,5,3,1,4};
		sumTriangle(array);
	}
	
	static void sumTriangle(int[] a) {
		
		if(a.length<1) {
			return;
		}
		
		int x;
		int[] temp = new int[a.length-1];
		
		for(int i=0;i<a.length-1;i++) {
			
		    x = a[i]+a[i+1];
			temp[i] = x;
			
		}
		
		sumTriangle(temp);
		System.out.println(Arrays.toString(a));
		
		
	}

}
