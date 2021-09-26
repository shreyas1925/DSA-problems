
public class Questions {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,2,5,4,3};
		System.out.println(duplicate(arr));
		
		int n = 8;
		System.out.println(isEven(n));
		System.out.println(isOdd(n));
		
		System.out.println(findBit(n,3));
		
		System.out.println(setBit(n,3));
		
	}
	
	   static int setBit(int n,int i) {
		
		return n | 1<<(i-1) ;
	}

	static int findBit(int n,int i) {
		return  n & 1<<(i-1);
	}

	static boolean isEven(int n) {
		return (n&1)==0;
	}

	 static boolean isOdd(int n) {	
			return (n&1)==1;
	 }
	 
	static int duplicate(int[] arr) {
		int unique=0;
		
		for(int ele: arr) {
			unique = unique^ele;
		}
		
		return unique;
	}
}
