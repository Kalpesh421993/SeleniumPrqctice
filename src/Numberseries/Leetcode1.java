package Numberseries;

public class Leetcode1 {
	public static void main(String[] args) {
			
		int nums[]= {11,58,35,73,5,18};
		
		for(int i=0;i<=nums.length-1;i++) {
			for(int j=i+1;j<=nums.length-1;j++) {
			if(nums[i]+nums[j]==29)
			{
			System.out.println("The indices are " +i+ ","+j);
			
			}
		}	
      }
	}
}
