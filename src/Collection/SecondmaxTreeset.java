package Collection;

import java.util.TreeSet;

public class SecondmaxTreeset {
		public static void main(String[] args) {
			
			int x[]= {21,22,54,76,88,96,77,21,34,54,65};
			
			TreeSet ts=new TreeSet();
			
			for (int  elememt : x) {
				ts.add(elememt);
				
			}
			System.out.println("second max element:"+ts.headSet(ts.last()).last());
		
		}
		
}
