package constructor;

public class Arryincr {
	public static void main(String[] args) {
		byte x[]= {10,20,30,40,50};
		//byte x[]=new byte[10];
		int addition=0;
		for (int i = 0; i <x.length-1; i++) {
			addition=addition+x[i];
			x[i]= (byte) (x[i]+x[i+1]);
			System.out.print(x[i]+",");
		}
		System.out.println(addition+",");
	}
}


