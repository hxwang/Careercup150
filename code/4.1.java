
//Approach 1: follow the definition
//get height, and check if the differences is more than 1

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
