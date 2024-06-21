package Hackerrank;

public class LeetMedianPuja {

	public static void main(String[] args) {
		LeetMedianPuja obj = new LeetMedianPuja();
		int nums1[] = {0,0,0,0,0}, nums2[] = {-1,0,0,0,0,0,1};
		double res = obj.findMedianSortedArrays(nums1, nums2);
		System.out.println(res);
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double result = 0;
		int p1 = 0, p2 = 0;
        int m = nums1.length;
        int n = nums2.length;

        int total = m + n;
        
        
        return result;
    }
}
