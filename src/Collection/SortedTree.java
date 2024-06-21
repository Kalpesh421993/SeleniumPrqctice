import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTree {
    public static void main(String[] args) {
        // Create an array with values
        Integer[] array = {5, 3, 8, 2, 1, 9, 4, 6, 7};

        // Convert array to a SortedSet for sorting
        SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(array));

        // Output sorted set
        System.out.println("Sorted set: " + sortedSet);
    }
}
