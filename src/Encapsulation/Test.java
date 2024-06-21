package Encapsulation;

public class Test extends Encapsulation {
	

	//private int setRollNumber;

	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.SetRollNumber(58);
		t1.setName("kap");
		t1.setAge(19);
		System.out.println(t1.getRollNumber());
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
	}
}
