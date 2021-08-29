package main;

import java.util.Scanner;

public class Somefunctions {

//	public Somefunctions() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static void main(String[] args) {
//	    Scanner in = new Scanner(System.in);
//	    String name = in.next();
//		
//		greet(name);
//		
//	}
//
//	private static void greet(String name) {
//		
//		System.out.println("Hello "+name);
//		
//	}

	
//	I need fibonacci number of 9 
	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//	    int number = in.nextInt();
//	    
//	    int a=0;
//	    int b=1;
//	    int count=2;
//	    
//	    while(count<=number) {
//	    	int temp=b;
//	    	b=b+a;
//	    	a=temp;
//	    	count++;
//	    }
//	    
//	    System.out.println(b);
//		
//		
//	}
	
//	Now i need series of fibonacci numbers of certain range
	
//    int a=0;
//    int b=1;
//    
//    System.out.print(a+" ");
//    for(int i=0;i<number-1;i++) {
//    	
//    	System.out.print(b+ " ");
//    	int temp = b;
//    	b=b+a;
//    	a=temp;
//    	
//      }
//	
//	}
//}
	

//	Now here i will be giving the max value and then below that max value all the fibonacci will be filled
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total number: ");
		int number = in.nextInt();
		
		int a = 0;
		int b= 1;
		
		System.out.println(a+ " ");
		while(b<=number) {
			
			System.out.println(b + " ");
			int temp = b;
			b=b+a;
			a=temp;
			
		}
		
	}
	
	
}
