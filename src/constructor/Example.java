package constructor;

// parameterized constructor ex

public class Example {
		int rollno;
		String name;
		
		public Example(int rno) {
			
			rollno=rno;
		}
		public Example(int rno,String sname) {
			rollno=rno;
			name=sname;
		}
		public static void main(String[] args) {
			Example e=new Example(23);
			Example e1=new Example(24,"kalpesh");
			//System.out.println(e.rollno);
			//System.out.println(e1.rollno);
			System.out.println(e1.name +e1.rollno);
			//e1.Example();
		}
}
