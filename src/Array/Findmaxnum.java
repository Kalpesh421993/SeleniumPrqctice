package Array;

public class Findmaxnum {
		public static void main(String[] args) {
			
			int x[]={12,45,87,21,79,89,70};
			int max=x[0];
			
			for(int i=1;i<x.length;i++) {
				if(x[i]> max) {
					max = x[i];
				}
			}
		
			System.out.println("max num from array: "+max);
		}
}
