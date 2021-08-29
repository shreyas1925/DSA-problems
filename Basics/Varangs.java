package main;

import java.util.Arrays;

public class Varangs {

	public static void main(String[] args) {
		
		function("3","4","Shreyas","Shettigar");
		
	}
	
	static void function(String ...v) {
		System.out.println(Arrays.toString(v));
	}
	

}
