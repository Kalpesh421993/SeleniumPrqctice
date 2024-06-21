package Hackerrank;

public class Addition3digit {
	public static void main(String[] args) {
		
		int x[]= {220,345,876,998};
		
		for(int i=0;i<x.length;i++) {
			
			int res=0;
			do {
				res=res+x[i]%10;
				x[i]=x[i]/10;
			}
			while(x[i]>0);
			
			x[i]=res;
			
			System.out.print(x[i]+",");
			
		}
	}
}
