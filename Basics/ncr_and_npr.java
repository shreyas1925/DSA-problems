package main;

import java.util.Scanner;

public class ncr_and_npr {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int r=in.nextInt();
		
	    int result=ncr_of_two_numbers(n,r);
	    System.out.println(result);
		
		
		
	}

	static int ncr_of_two_numbers(int n,int r) {
		
		int nfact=1;
		for(int i=n;i>0;i--) {
			nfact=nfact*i;
		}
		
		int rfact=1;
		for(int j=r;j>0;j--) {
			rfact=rfact*j;
		}
  
        int newfact=1;
        int m=n-r;
		for(int k=m;k>0;k--) {
			newfact=newfact*k;
		}
		
//		System.out.println(nfact);
//		System.out.println(rfact);
//		System.out.println(newfact);
		
		int answer=nfact/(newfact*rfact);
		
		return answer;
	}
	
}
