import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
	 
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		int d=n-m;
		int sum=0;
		int psum=0;
		
//		int[] arr=new int[d];
//		int[] arr= {1,2,3,4,5
		
		int[] arr=new int[d+1];
		
		for(int k=0;k<=d;k++) {
			arr[k]=in.nextInt();
		}
		
		bubblesort(arr);
		
		for(int i=1;i<arr.length;i++) {
			sum+=i;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			psum+=i;
		}
		
		System.out.println(sum-psum);

		
	}
	static void bubblesort(int[] arr) {
        boolean swapped;
		
		for(int i=0;i<arr.length;i++) {
			swapped=false;		
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
					
				}						
			}
			
			if(!swapped) {
//				System.out.println(i+1);
				break;
			}

		}


    }
}
