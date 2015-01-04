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
		System.out.println(isUniqueChars2(""));
		System.out.println(isUniqueChars2("ab"));
		System.out.println(isUniqueChars2("bab"));
	}
	
	public static boolean isUniqueChars2(String str){
		
		//there are only 256 ASCII code
		if(str.length()>256) return false;
		
		//use an array to record if an ASCII code has appeared
		boolean[] used = new boolean[256];
		for(int i=0; i<str.length(); i++){
			int idx = str.charAt(i);
			if(used[idx]) return false;
			else used[idx]= true;
		}
		
		return true;
	}
}
