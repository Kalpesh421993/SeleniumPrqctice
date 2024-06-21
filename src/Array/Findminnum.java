package Array;

public class Findminnum {
	public static void main(String[] args) {
		
		int x[]={20,45,87,12,79,89,70};
		int min=70;
		
		for(int i=0;i<x.length;i++) {
			if(x[i]< min) {
				min = x[i];
			}
		}
		System.out.println("min num from array: "+min);
	}
}



