package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>(10);
//		
//		list.add(41);
//		list.add(784);
//		
//		System.out.println(list); //in default list has  toString() method
		
//		lets do 2D ArryList
//	   Scanner in=new Scanner(System.in);
//	   ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	   
//	
//	   
//	   
//	   for(int i=0;i<3;i++) {
//		   list.add(new ArrayList<>());
//	   }
//	   
//	   for(int i=0;i<3;i++) {
//		   for(int j=0;j<3;j++) {
//			   list.get(i).add(in.nextInt());
//			   
//		   }
//	   }
//	   
//	   System.out.println(list);
//		
//	}

		
//		It was the revision by seeing kunal's vedio
		
		
		int[][] arr = {{4,5,7},{1,2},{4,3,6,9}};
		
//		int[][] arr = new int[3][3];
		
//		Scanner in = new Scanner(System.in);
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=in.nextInt();
//			}
//			
//		}
		
		for(int[] num : arr) {
			System.out.println(Arrays.toString(num));
		}
		
	}
}
