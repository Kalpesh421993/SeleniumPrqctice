package Collection;

import java.util.HashSet;

public class HashSetDemo {
		
		public static void main(String[] args) {
			
			HashSet hs=new HashSet();
			hs.add(10);
			hs.add(3.14f);
			hs.add("hello");
			hs.add(10);
			hs.add(20);
			
			
			System.out.println(hs);
			System.out.println(hs.add(10));
		}
}
