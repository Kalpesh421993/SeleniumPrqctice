package Array;

public class Findminmax {
		public static void main(String[] args) {
			
			int x[]={12,45,87,21,79,89,70};
			
			int min=x[0];
			int max=x[0];
			
			for(int i=1;i<x.length;i++) {
				if(x[i]< min) {
					min = x[i];
				}
				if(x[i]> max) {
					max = x[i];
			}
				
				System.out.println("min num from array: "+min+" max num from array"+max);	
		}	
		
			
	}
}