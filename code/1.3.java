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
		System.out.println(permutation ("ab", "ba"));
		System.out.println(permutation ("ab", "a"));
		System.out.println(permutation ("", ""));
	}
	
	//sort array
	public static String sort(String str){
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	
	//compare
	public static boolean permutation(String a, String b){
		if(a.length()!=b.length()) return false;
		a = sort(a);
		b = sort(b);
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i) != b.charAt(i)) 
				return false;
		}
		
		return true;
	}
}
