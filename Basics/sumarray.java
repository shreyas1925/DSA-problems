package main;

public class sumarray {

	public static void main(String[] args) {
		
		int[][] nums= {{1,2,3},{3,2,1}};
		
		int sum=0;
		int max=0;
        for(int i=0;i<nums.length;i++){
        	sum=0;
            for(int j=0;j<nums[i].length;j++){
            	  sum=sum+nums[i][j];	
            }
            max=Math.max(sum, max);
            
        }
		
      
       System.out.println(max);
		
	}

	
}
