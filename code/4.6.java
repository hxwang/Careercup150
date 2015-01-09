
//Problem: find successor

//return the min of the right-sub-tree
//if there is no right-sub-tree, return current's nodes' parent
//if find no parent, return null

public TreeNode inorderSucc(TreeNode n){
  if(n==null) return null;
  //found right-child, return leftmost node of right subtree
  if(n.parent==null || n.right!=null){
    reutrn leftMostChild(n.right);
  }
  else{
    TreeNode q = n;
    TreeNode x = q.parent;
    
    //go up until we're on left instead of right
    while(x!=null && x.left!=q){
      q = x;
      x = x.parent;
    }
    
    return x;
  }
}

//find leftMost
public TreeNode leftMostChild(TreeNode n){
  if(n==null) return null;
  while(n.left!=null)
    n = n.left;
  return n;
}
