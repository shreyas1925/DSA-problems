
public class MinMaxRecursion {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 3, -5, -4, 8, 6};
		int mini =  Min(arr,arr.length);
		int maxi = Max(arr,arr.length);
		System.out.println(mini);
		System.out.println(maxi);
	}
	
	static int Min(int[] a,int n) {
		
		if(n==1) {
			return a[0];
		}
		
		
		return Math.min(a[n-1], Min(a,n-1));
	}
	
	static int Max(int[] a,int n) {
		
		if(n==1) {
			return a[0];
		}
		
		
		return Math.max(a[n-1], Max(a,n-1));
	}

}
