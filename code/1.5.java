/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(compressString("ab"));
		System.out.println(compressString("abb"));
		System.out.println(compressString("aaaabb"));
		
	}
	
	public static String compressString(String str){
		
		int i = 0;
		StringBuffer sb = new StringBuffer();
		while(i<str.length()){
			char curr = str.charAt(i);
			int count = 1;
			//count for repeat chars
			while(i!=str.length()-1 && str.charAt(i+1)==curr){
				i++;
				count++;
			}
			
			sb.append(curr);
			sb.append(count+"");
			i++;
		}
		
		String rnt = sb.toString();
		if(rnt.length() >= str.length()) return str;
		else return rnt;
	}
}
