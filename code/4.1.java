
//Approach 1: follow the definition
//get height, and check if the differences is more than 1

//Time complexity: O(n^2)

public static int getHeight(TreeNode root){
  if(root == null) return 0; //base case
  return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}

public static boolean isBalanced(TreeNode root){
  if(root==null) return true; //base case
  
  int heightDiff = getHeight(root.left) - getHeight(root.right);
  
  if(Math.abs(heightDiff)>1){
    return false;
  }
  //recursive get whether balanced or not
  else return isBalanced(root.left) && isBalanced(root.right);
}


//Approach 2: improved on Approach 1
//check balanced while get height

//time complexity: O(n), 
//space complexity; )(log n)

public static int checkHeight(TreeNode root){
  if(root==null)
    return 0; //height of 0
  
  //check if left is balanced
  int leftHeight = checkHeight(root.left);
  if(leftHeight==-1)
    return -1;//not balanced
  
  //check if right is balanced
  int rightheight = checkheight(root.right);
  if(rightHeight == -1)
    return -1;
  
  //check if currentNode is balanced
  int heightDiff = Math.abs(leftHeight - rightHeight);
  if(heightDiff>1)
    return -1;
  else return Math.max(leftHeight, rightHeight)+1;
}


public static boolean isBalanced(Tree root){
  if(checkHeight(root)==-1)
    return false;
  else return true;
}
