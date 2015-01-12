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
		System.out.println(makeChanges(0,25));
		System.out.println(makeChanges(5,25));
		System.out.println(makeChanges(10,25));
		System.out.println(makeChanges(100,25));
	}
	
	//Recursive call makechanges to divide n by denom
	//Note that: we need first go through large denom, and eventually decrease to 1, i.e., 25, 10, 5, 1...
	public static int makeChanges(int n, int denom){
		int next_denom = 0;
		switch(denom){
			case 25:
				next_denom = 10;
				break;
			case 10:
				next_denom = 5;
				break;
			case 5:
				next_denom = 1;
				break;
			case 1:
				next_denom = 1;
				return 1;
		}
		
		int ways = 0;
		for(int i=0; i*denom <= n; i++){
			ways += makeChanges(n-i*denom, next_denom);
		}
		
		return ways;
	}


}
