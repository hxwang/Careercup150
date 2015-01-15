
//dynamic programming: enumerate the cases when put each element at bottom
//time complexity: O(n^2)


/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class People{
		int height;
		int weight;
		
		public People(int height, int weight){
			this.height = height;
			this.weight = weight;
		}
		
		public boolean canBeAbove(People bottom){
			if(this.height >= bottom.height) return false;
			if(this.weight >= bottom.weight) return false;
			return true;
		}
		
		@Override
		public String toString(){
			return this.height+"-"+this.weight;
		}
}
	
class Ideone
{
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList<People> list = new ArrayList<People>();
		list.add(new People(65, 100));
		list.add(new People(70, 150));
		list.add(new People(56, 90));
		list.add(new People(75, 190));
		list.add(new People(60, 95));
		list.add(new People(68, 110));
		
		HashMap<People, ArrayList<People>> map = new HashMap<>();
		for(int i=0; i<list.size(); i++)
			dp(list, list.get(i), map);
		
		ArrayList<People> max_list = new ArrayList<People>();
		int max_size = 0;
		for(People key: map.keySet()){
			if(map.get(key).size()>max_size){
				max_size = map.get(key).size();
				max_list = map.get(key);
			}
		}
		
		System.out.println(max_size);
		System.out.println(max_list);
	}
	
	public static ArrayList<People> dp(ArrayList<People> list, People bottom, HashMap<People, ArrayList<People>> map){
		if(map.containsKey(bottom)) return map.get(bottom);
		
		ArrayList<People> max_list = new ArrayList<People>();
		int max_size = 0;
		for(int i=0; i<list.size(); i++){
			People curr = list.get(i);
			if(bottom.canBeAbove(curr)){
				ArrayList<People> currList = dp(list, curr, map);
				if(currList.size()>max_size){
					max_size = currList.size();
					max_list = currList;
				}
			}
		}
		
		max_list.add(0,bottom);
		map.put(bottom, max_list);
		
		return max_list;
	}
	
	
}
