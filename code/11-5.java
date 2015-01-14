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
		String[] input = new String[]{"at", "", "","","ball","","","car","","","dad","",""};
	    String target = "ball";
		System.out.println(search(input, 0, input.length-1, target));
	}
	
	//binary search
	public static int search(String[] s, int left, int right, String target){
		if(left>right) return -1;
		int mid = (left+right)/2;
		if(s[mid].equals(target)) return mid;
		int rightmid = mid;
		
		//while mid is "", move to first non-empty string
		while(s[mid].equals("")){
			if(mid<=left)
				return search(s, rightmid+1, right, target);
			mid--;
		}
		
		if(s[mid].equals(target)) return mid;
		
		int incr = compare(s[mid], target);
		
		if(incr == 1)
			return search(s, rightmid+1, right, target);
		else 
			return search(s, left, mid-1, target);
		
	}
	
	//compare two strings
	public static int compare(String s1, String s2){
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i=0; i<Math.min(c1.length, c2.length); i++){
			if(c1[i]<c2[i])
				return 1;
			else if(c1[i] > c2[i])
				return -1;
		}
		
		if(c1.length<c2.length) return 1;
		if(c1.length > c2.length) return -1;
		return 0;
	}
}
