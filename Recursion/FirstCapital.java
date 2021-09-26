//Linear search Approach

public class FirstCapital {

//	public static void main(String[] args) {
//		
////		String str = "geekyMan";
//			String str = "saleSman";
//			char ch = firstCapital(str);
//			System.out.println(ch);
//			
//	}
//	
//	static char firstCapital(String str) {
//		
//		for(int i=0;i<str.length();i++) {
//			if( str.charAt(i) < 97) {
//				return str.charAt(i);
//			}
//		}
//	
//		return 'a';
//	}
	

	public static void main(String[] args) {
		
//		String str = "geekyMan";
		String str = "saleSman";
		int n=0;
		System.out.println(firstCapital(str,n));		
	}
	
	static char firstCapital(String str,int n) {
		
			if(Character.isUpperCase(str.charAt(n))) {
				return str.charAt(n);
			}
			
		return firstCapital(str,n+1);	
	}
	
	
}
