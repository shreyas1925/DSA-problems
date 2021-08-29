import java.util.Scanner;

//import java.util.Arrays;
//
//public class BubbleSort {
//
//	public static void main(String[] args) {
//	
//		
//		int[] nums = {5 ,1 ,6, 2 ,8 ,3 ,4 ,10 ,9 ,7};
//		bubblesort(nums);
//		System.out.println(Arrays.toString(nums));		
//		
//		
//	}
//	
//	
//	static void bubblesort(int[] arr) {
//		
//		boolean swapped;
//		
//		for(int i=0;i<arr.length;i++) {
//			swapped=false;		
//			for(int j=1;j<arr.length-i;j++) {
//				if(arr[j]<arr[j-1]) {
//					int temp=arr[j];
//					arr[j]=arr[j-1];
//					arr[j-1]=temp;
//					swapped=true;
//					
//				}						
//			}
//			
//			if(!swapped) {
//				System.out.println(i+1);
//				break;
//			}
//
//		}
//	}
//}




/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BubbleSort {
    public static void main(String args[] ) throws Exception {

        // int[] nums = {5 ,1 ,6, 2 ,8 ,3 ,4 ,10 ,9 ,7};
   
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        
        for(int k=0;k<n;k++){
            nums[k] = in.nextInt();
        }


		bubblesort(nums);
			
    }

    static void bubblesort(int[] arr) {
        boolean swapped;
		
		for(int i=0;i<arr.length;i++) {
			swapped=false;		
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
					
				}						
			}
			
			if(!swapped) {
				System.out.println(i+1);
				break;
			}

		}


    }
}
