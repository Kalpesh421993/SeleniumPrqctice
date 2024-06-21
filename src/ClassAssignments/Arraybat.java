package ClassAssignments;

public class Arraybat {
	
	public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
	public static void main(String[] args) {
		
		int array1[]= {1, 2, 6};
		int array2[]= {6, 1, 2, 3};
		int array3[]= {13, 6, 1, 2, 3};
		
		System.out.println(firstLast6(array1)); 
		System.out.println(firstLast6(array2));
		System.out.println(firstLast6(array3));
        
    }

 }

