package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Hacker {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		int N=sc.nextInt();
		System.out.println("insert num"+N);
//		int N=sc.nextInt();

		ArrayList<Integer> l=new ArrayList(); 

		int getnum;  

		    
		for(int i=0;i<N;i++)
		{
		    getnum=sc.nextInt();  
		    l.add(getnum);   

		}

		int Q=sc.nextInt(); 

		for(int i=0;i<Q;i++)

		{

		   String query=sc.next();  

		   if(query.equals("Insert"))
		   {
		       int index=sc.nextInt();
		       int num=sc.nextInt();
		       l.add(index,num);
		   } 

		    if(query.equals("Delete"))
		    {
		        int index=sc.nextInt();
		        l.remove(index);
		    }

		}
		for(int i=0;i<l.size();i++)
		{
		 System.out.print(l.get(i)+" ");  
		}

		}
}
