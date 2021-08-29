package main;

import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int runs = in.nextInt();
		int outs = in.nextInt();
		
		int average = batting_average(runs,outs);
		System.out.println(average);
	}
	
	static int batting_average(int runs,int outs) {
		int average=runs/outs;
		return average;
	}

}
