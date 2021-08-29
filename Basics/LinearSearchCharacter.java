package main;

public class LinearSearchCharacter {

	public static void main(String[] args) {
		
		String name="Shreyas";
		char ch = 's';
		
		boolean ans = searchCharacter(name,ch);
		System.out.println(ans);
	}

	static boolean searchCharacter(String name,char ch) {
		if(name.length()==0) {
			return false;
		}
		
//		for(int i=0;i<name.length();i++) {
//			if(ch==name.charAt(i)) {
//				return true;
//			}
//		}
		
//		same in for each array , to do for each loop it should be in some array format
		
		for(char character : name.toCharArray()) {
			if(character==ch) {
				return true;
			}
		}
		
		return false;
	}
	
}
