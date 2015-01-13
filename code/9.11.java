
/////////////////////////////// My implementation
//way0[i][j]: denote the number of ways to make i...j as 0
//way1[i][j]: denote the number of ways to make i...j as 1

//ways0[i][j] = ways[i][k] * ways[k+1][j]
//ways1[i][j] = ways[i][k] * ways[k+1][j]

//return ways[0][n-1]

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
		System.out.println(getCount("1^0|0|1", 0));
	}
	
	public static int getCount(String exp, int goal){
	  int len = exp.length()/2+1;
	  //symbox index: 2*i+1
	  int[][] way0 = new int[len][len];
	  int[][] way1 = new int[len][len];
	  if(exp.length()==0) return 0;
	  
	  for(int i=0; i<len; i++){
	    char c = exp.charAt(2*i);
	    if(c=='0') way0[i][i] = 1;
	    else way1[i][i] = 1;
	  }
	  
	  for(int step=1; step<len; step++){
	  for(int i=0; i<len-step; i++){
	  	  int j = i+step;
	      for(int k=i; k<j; k++){
	        char c = exp.charAt(2*k+1);
	        //System.out.println("i= "+i + " k= "+k + " j= "+ j + " c= "+c);
	        if(c=='&'){
	          way0[i][j] += way0[i][k]*(way0[k+1][j] + way1[k+1][j]);
	          way0[i][j] += way1[i][k]*way0[k+1][j];
	          way1[i][j] += way1[i][k]*way1[k+1][j];
	        }
	        else if(c=='|'){
	          way0[i][j] += way0[i][k] * way0[k+1][j];
	          way1[i][j] += (way0[i][k] + way1[i][k]) * way1[k+1][j]+ way1[i][k]*way1[k+1][j];
	        }
	        else if(c== '^'){
	          way0[i][j] += (way1[i][k] * way1[k+1][j] + way0[i][k] * way0[k+1][j]);
	          way1[i][j] += (way0[i][k] * way1[k+1][j] + way1[i][k] * way0[k+1][j]);
	        }
	      }
	      //System.out.println("way0 "+i+"-"+j +"= "+ way0[i][j]);
	    }
	  }
	  
	  if(goal ==0) return way0[0][len-1];
	  else return way1[0][len-1];
	}
}
