package main;

class Parent{
	  
	   void show() {
		   System.out.println("Showing from parent class ");
	   }
	}
	
	class Child extends Parent{
		void show() {
			System.out.println("Showing from child class ");
		}
	}
	
	
public class Overloading_and_Overriding {

//		Method overloading where our parameters may be different types or different times it would have been appeared like a,b and a,b,c
//	public static void main(String[] args) {
//		
//		int ans = sum(4,5);
//		System.out.println(ans);
//		sum(7,8,1);
//		
//	}
//	
//	static int sum(int a ,int b) {
//		return a+b;
//	}
//	
//	static int sum(int a , int b,int c) {
//		return a+b+c;
//	}
	
	
	
	
	public static void main(String[] args) {
		Parent obj1 = new Parent();
//		obj1.show();
		
//		Child obj2 = new Child();
//		obj2.show();
		
		Parent obj2 = new Child();
		obj2.show();
		
	}
	

}
