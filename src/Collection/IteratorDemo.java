package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
		public static void main(String[] args) {
			
			LinkedList < Integer > ll = new LinkedList < Integer > ();
	        ll.add (10);
	        ll.add (25);
	        ll.add (50);
	        ll.add (20);
	        ll.add (25);
	        ll.add (23);
	        ll.add (60);
	        ll.add (25);
	        ll.add (30);
	        ll.add (40);
	        ll.add (15);
	        ll.add (25);
	        System.out.println (ll);
	        Iterator it = ll.descendingIterator ();
	        while (it.hasNext ())
	        {
	         System.out.println (it.next ());
	        }
	        Iterator it1 = ll.descendingIterator ();
	        while (it1.hasNext ())
	        {
	         Integer e = (Integer) it1.next (); //down casting
	         if (e == 25)
	         {
	             it1.remove ();
	         }
	        }
	        System.out.println (ll);
	    }

		}

