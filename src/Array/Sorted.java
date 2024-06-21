package Array;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {
	    public static void main(String[] args) {
	       Number [] array = {5, 3, 8, 2, 1, 9, 4, 6, 7};

	        SortedSet<Number> sortedSet = new TreeSet(Arrays.asList(array));

	        System.out.println("Sorted set: " + sortedSet);
	        
	        
	        Integer secondLast = null;
	        if (sortedSet.size() >= 2) {
	            secondLast = (Integer) sortedSet.headSet(sortedSet.last()).last();
	        }

	        System.out.println("Second last element: " + secondLast);
	    }
	}

