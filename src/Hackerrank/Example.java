package Hackerrank;
public class Example {
		public static void main(String[] args) {
			int x[]= {220,345,876,998};
			
				int i=0;
				while(i<x.length) {
				//int num=x[i];
				int res=0;
				
				while(x[i]>0) {
					
				res+=x[i]%10;
				x[i]=x[i]/10;
				}
				x[i]=res;
				System.out.println(x[i]);
			}
				//if(i<x.length-1) {
				//	System.out.print(",");
	}
				//i++;
}
		

		
		

