
public class CharaterBinary {

	public static void main(String[] args) 	{
	
		char[] arr = {'a','b','c','d','e'};
		char target = 'f';
		
	   char ans=search(arr,target);
	   System.out.println(ans);
	}
	
	static char search(char[] arr,char target) {
		
		int s = 0;
		int e = arr.length-1;
		
				
		while(s<=e) {
			int mid = s+ (e-s)/2;
			
			if(target < arr[mid]) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		
		return arr[s % arr.length];
	}

}
