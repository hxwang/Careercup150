/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */


//use binary tree to store the data
//also keep left-tree-size in order to return the rank of number faster!
class Node{
	Node left;
	Node right;
	int data;
	int leftTreeSize;
	Node(int data){
		this.data = data;
		this.leftTreeSize = 0;
	}
	
	public void insert(int d){
		if(d <= data){
			if(left!=null) left.insert(d);
			else left = new Node(d);
			leftTreeSize++;
		}
		else{
			if(right!=null) right.insert(d);
			else right = new Node(d);
		}
	}
	
	public int getRank(int d){
		if(d == data)
			return leftTreeSize;
		else if(d < data){
			if(left == null) return -1;
			else return left.getRank(d);
		}
		else{
			int right_rank = right==null ? -1: right.getRank(d);
			if(right_rank == -1) return -1;
			else return leftTreeSize + 1 + right_rank;
		}
	}
}


class Ideone
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Node root = null;
		root = track(5, root);
		root = track(1, root);
		root = track(4, root);
		root = track(4, root);
		root = track(5, root);
		root = track(9, root);
		root = track(7, root);
		root = track(13, root);
		root = track(3, root);
		
		System.out.println("Rank of 1 = " + getRankOfNumber(1, root));
		System.out.println("Rank of 3 = " + getRankOfNumber(3,root));
		System.out.println("Rank of 4 = " + getRankOfNumber(4,root));
	}
	
	public static Node track(int number, Node root){
		if(root == null)
			return new Node(number);
		else {
			root.insert(number);
			return root;
		}
	}
	
	public static int getRankOfNumber(int number, Node root){
		if(root==null) return -1;
		return root.getRank(number);
	}
	
}
