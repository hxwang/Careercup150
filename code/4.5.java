
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
