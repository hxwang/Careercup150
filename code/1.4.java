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
		char[] str = new char[]{'a', ' ', 'b', 'c', ' ', ' '};
		int length = 3;
		replaceSpaces(str, length);
		System.out.println(str);
		
		char[] str2 = new char[]{'a', ' ', 'b', 'c', ' ', ' '};
		int length2 = 2;
		replaceSpaces(str2, length2);
		System.out.println(str2);
	}
	
	public static void replaceSpaces(char[] str, int length){
		int spaceCount = 0;
		//count how many space
		for(int i=0; i<length; i++){
			if(str[i]==' ') spaceCount++;
		}
		
		//calculate total length
		int totalLength = length + 2*spaceCount;
		
		//fill the char array in backward manner
		str[totalLength] = '\0';
		int currIndex = totalLength-1;
		for(int i=length-1; i>=0; i--){
			if(str[i]==' '){
				str[currIndex] = '%';
				str[currIndex-1] = '0';
				str[currIndex-2] = '2';
				currIndex = currIndex -3;
			}
			else{
				str[currIndex] = str[i];
				currIndex--;
			}
		}
	}
}
