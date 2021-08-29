
public class Patterns {

	public static void main(String[] args) {
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		pattern2();
//		pattern3();
//		pattern4();
		pattern5();
//		pattern6();

	}
	
    static void pattern2() {
		
    	for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<5-i) {
					System.out.print("* ");
				}else {
					System.out.print("");
				}
				
			}
			System.out.println();
		}
		
		
		
	}

     
	
    static void pattern3() {
		
    	for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<=i) {
					System.out.print("* ");
				}else {
					System.out.print("");
				}
				
			}
			System.out.println();
		}
    	
		
    	for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<5-i) {
					System.out.print("* ");
				}else {
					System.out.print("");
				}
				
			}
			System.out.println();
		}
		
		
	}
    
	
    static void pattern4() {
		
		
    	for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j<=6-i) {
					System.out.print(i + " ");
				}else {
					System.out.print("");
				}
				
			}
			System.out.println();
		}
    	
    	for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j<=6-i) {
					System.out.print(" ");
				}else {
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
    
	
    static void pattern5() {
		
		int k;
    	
    	for(int i=0;i<=5;i++) {
    	
    		k=1;
    		
			for(int j=0;j<=9;j++) {
				if(j>=6-i && j<=4+i && k==1) {
					System.out.print("*");
					k=0;
				}else {
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.println();
		}

		
		
	}
    
 static void pattern6() {
		
		
    

		
		
	}
    
}
