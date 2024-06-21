package constructor;

public class Constructor {

	int x; //loaded into memory
	String name;
	
//	{
//		x=10;
//		System.out.println(x);  //instance block
//    }
	public Constructor() {
		super();
		System.out.println("I am constructor from constructor class");
		
		//x=20;
	}
	
    public static void main(String[] args) {
	 Constructor c1=new Constructor();
	 Constructor c2=new Constructor();
	 c1.x=30;
	 System.out.println(c2.x);
	 
   }
}