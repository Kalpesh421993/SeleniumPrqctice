package Array;


import java.util.Arrays;

public class Arrayelementsadd {
	public static void main(String[] args) {
		
		int[] x = {1, 2, 3};
        int[] y = {3,7,9,9,7,5};
        		
        int z[]=new int[x.length+y.length];
        
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        
        for(int i=0;i< y.length;i++) {
        	z[x.length+i]=y[i];
        }
        
        System.out.println("New array elements:");
        for(int j=0;j<x.length+y.length;j++) {
        	System.out.println(z[j]);
        }
    }
}