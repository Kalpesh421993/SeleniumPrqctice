package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {
		
		public static void main(String[] args) {
			
			LinkedList li=new LinkedList();
			ArrayList al=new  ArrayList();
			
			al.add(10);
			al.add("kp");
			al.add(13);
			al.add(90);
			li.add(10);
			li.add(22);
			li.add(89);
			li.add(89);
			li.add("kp");
			
			System.out.println(li.retainAll(al));
			System.out.println();
			System.out.println(al);
			//System.out.println(li);
			//li.get(4);
			//System.out.println(li.get(4));
		}
}
