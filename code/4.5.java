
//Approach 1: In order traverse
//copy the elements into an array, and then check to see if the array is sorted
//drawback: the solution takes up a bit of extra memory

public static int index = 0;
public static void copyBST(TreeNode root, int[] array){
  if(root==null) return;
  copyBST(root.left, array);
  array[index] = root.data;
  index++;
  copyBST(root.right, array);
}

public static boolean checkBST(TreeNode root){
  int[] array = new int[root.size];
  copyBST(root, array);
  for(int i=1; i<array.length; i++)
    if(array[i] < array[i-1]) return false;
  return true;
}


//Approach 2: 
//the array is not necessary, we can compare the element we saw as we go
//inroder traverse

public static int last_printed = Integer.MIN_VALUE;

public static boolean checkBST(TreeNode n){
  if(n==null) return true;
  
  //check, recursive left
  if(!(checkBST(n.left))) return false;
  
  //check current
  if(n.data > last_printed) return false;
  last_printed = n.data;
  
  //check, recursive right
  if(!checkBST(n.right)) return false;
  return true;
}


//Approach 3: the MIN/MAX solution
//when go left, update max
//when go right, update min
//check value is not in the range (min, max), we stop and return false

//time complexity: O(n)
//space complexity: O(log n), since there are up to O(log n) recursive calls on stack since we may recurse up to the depth of the tree
boolean checkBST(TreeNode n){
  return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

boolean checkBST(TreeNode n, int min, int max){
  if(n==null) return true;
  if(n.data<min || n.data>max) return false;
  
  //recursive check
  if(!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max))
    return false;
  
  return true;
}
