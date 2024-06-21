package Numberseries;

public class Practice2 {
	
   public static void main(String[] args) {
		
	int x[] = {11,58,35,73,5,18};

	for(int i=0;i<x.length-1;i++) {
		for(int j=0;j<x.length-1;j++) {
			if(x[j]<x[j+1]) {
				
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			
			}
		}
		for(int k=0;k<x.length;k++)
		{
			System.out.println(x[k]);
		}
	}
  }
}
	