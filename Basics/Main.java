package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		int p = input.nextInt();
//		int t= input.nextInt();
//		char operator=input.next().charAt(0);
	
		
//		if(operator=='+') {
//			int sum = p+t;
//			System.out.println(sum);
//		}else {
//			System.out.println("no");
//		}
		
//		switch(operator) {
//		case '+':
//			System.out.println(p+t);
//			break;
//		case '-':
//			System.out.println(p-t);
//			break;
//		case '*':
//			System.out.println(p*t);
//			break;
//		
//		}
		
		
		int user = input.nextInt();
		int sum=0;
		int max=0;
		
		while(user!=0) {
			
			int m = input.nextInt();
//			sum=sum+m;
			
			if(m==0) {
				return;
			}
			
			if(m>max) {
				max=m;
			}
			
			System.out.println(max);
		}
		
	
	}
}
