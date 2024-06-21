package Array;

import java.util.Scanner;

public class AddElementarray {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter array size");
	  
	  int size=sc.nextInt();
	  int x[]=new int[size+1];
	  System.out.println("enter array elements");
	  
	  for(int i=0;i<size;i++) {
		  x[i]=sc.nextInt();
	  }
	  System.out.println("enter array location: ");
	  int loc=sc.nextInt();
	  System.out.println("enter new element");
	  int newelement=sc.nextInt();
	  
	  for(int i=size;i>loc;i--) {
		  x[i]=x[i-1];
	  }
	  x[loc]=newelement;
	  size++;
	  
	  for(int i=0;i<size;i++) {
		  System.out.println(x[i]+" ");
	  }
		  
		  
  }
}

