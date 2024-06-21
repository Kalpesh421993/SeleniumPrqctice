package String;

import java.util.Scanner;

public class StringSecondletter {
	public static void main(String[] args){

		String input="testing shastra is for testing";

		char ch[]=input.toLowerCase().toCharArray();

		//second letter of every word is capitalised

		for(int i=0;i<ch.length;i++){

			ch[1]=Character.toUpperCase(ch[1]);

			if (Character.isWhitespace(ch[i]) && Character.isLetter(ch[i+1])) {

				ch[i+2]=Character.toUpperCase(ch[i+2]);
			}

		}

		String str= new String(ch);

		System.out.println(str);
	

	}

}
