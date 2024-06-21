package Array;

public class Average {
		public static void main(String[] args) {
			int x[]= {22,34,12,54,65,33,45};
			
			int sum=0;
			
			for(int i=0;i<x.length;i++) {
				
				sum=sum+x[i];
			}
			int avarage=sum/x.length;
			System.out.println("Avarage value of Array elements:"+avarage);
			
		}
}
