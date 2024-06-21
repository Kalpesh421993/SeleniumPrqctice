package Array;

public class Addition {

	//this is array program to addition
	public static void main(String[] args) {
		byte x[]= {10,20,30,40,50};
	   int addition=0;
		for (int i = 0; i < x.length; i++) {
			addition=addition+x[i];
			x[i]= (byte) (x[i]+x[i+1]);
			System.out.println(x[i]+" ");
		}
		System.out.println(addition+" ");
	}
}



