package Array;

import java.util.ArrayList;
import java.util.List;

public class Arryalist {
		public static void main(String[] args) {
			
			ArrayList al= new ArrayList();
			al.add(12);
			al.add(22);
			al.add(32);
			al.add(45);
			al.add(89);
			al.add(12);
			
//			System.out.println(al.add(12));
//			System.out.println(al);
//			Integer[] y=new Integer[al.size()];
//			y=(Integer[])al.toArray(y);
//			int r= y[1]+5;
			//System.out.println(r);
			
			System.out.println(al.set(3, 67)); //replaced 45 with 67
			
			al.add(3,78);
			
			System.out.println(al);
			
			System.out.println(al.indexOf(12));
			
			System.out.println(al.lastIndexOf(12));
			
			System.out.println(al.subList(3, 6));
			
			
		}
}		
