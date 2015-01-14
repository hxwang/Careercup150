/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String[] input = new String[4];
		input[0] = "ab";
		input[1] = "ac";
		input[2] = "ba";
		input[3] = "ca";
		
		System.out.println(sortString(input));
		// your code goes here
	
	}
	
	public static String sortString(String[] args){
		
		//put anagrams in the same positions by key
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for(int i=0; i<args.length; i++){
			String key = getKey(args[i]);
			ArrayList<String> curr = new ArrayList<String>();
			if(map.containsKey(key))
				curr = map.get(key);
			curr.add(args[i]);
			map.put(key, curr);
		}
		
		String rnt = new String();
		for(String key: map.keySet()){
			ArrayList<String> list = map.get(key);
			for(String item: list)
				rnt += item;
		}
		
		return rnt;
	}
	
	//sort string to get key
	//anagrams would have the same key
	public static String getKey(String s){
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
