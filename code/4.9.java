

//
void findSum(TreeNode node, int sum, int[] path, int level){
  if(node==null)
    return;
  
  path[level] = node.data;
  
  //look for path with a sume ends at this node
  int t = 0;
  for(int i=level; i>=0; i--){
    t+=path[i];
    if(t==sum)
      print(path, i, level);
  }
  
  //search nodes beneath this one
  findSum(node.left, sum, path, level+1);
  findSum(node.right, sum, path, level+1);
  
  //remove current node from path
  path[level] = Integer.MIN_VALUE;
}

public void findSum(TreeNode node, int sum){
  int depth = depth(node);
  int[] path = new int[depth];
  findSum(node, sum, path, 0);
}

public static void print(int[] path, int start, int end){
  for(int i=start; i<end; i++)
    System.out.println(path[i]);
  System.out.println();
}

public int depth(TreeNode node){
  if(node==null)
    return 0;
  else return 1 + Math.max(depth(node.left), depth(node.right));
}
