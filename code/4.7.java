
//Approach 1: assume with links to parent
//trace p's and q's path until they intersects

//Approach 2: assume without linkes to parent
//branch left to search
//brach right to search
//if both not found, then you must have found the first common ancestor

//Time complexity: O(n), since cut half nodes in each iteration

//return true if p is a descent of root
boolean covers(TreeNode root, TreeNode p){
  if(root==null) return false;
  if(root==p) return true;
  return covers(root.left, p) || covers(root.right,p);
}

TreeNode commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
  if(root==null) return null;
  if(root == p || root==q) return root;
  boolean is_p_on_left = covers(root.left, p);
  boolean is_q_on_left = coverrs(root.left, q);
  
  //if p and q are on different sides, return root
  if(is_p_on_left != is_q_on_left) return root;
  
  //else, they are on the same side, traverse this side
  TreeNode child_side = is_p_on_left ? root.left: root.right;
  return commonAncestorHelper(child_side, p, q);
}


TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
  //error check
  if(!cover(root,p) || !cover(root,q)) 
    return null;
  return commonAncestorHelper(root, p, q);
}

--------------------------------------------------------------------------------------------
//Not understand!
//Approach 3:
//Aprpach 2 is not efficient since it search each subtree over and over again
//We should be able to "bubble up" the findings to earlier nodes in the stack


//return two values: the node itself and a flag indicating whether this node is actually the common ancestor
public static class Result{
  public TreeNode node;
  public boolean isAncestor;
  public Result(TreeNode n, boolean inAnc){
    node = n;
    inAncestor = inAnc;
  }
}

Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q){
  if(root == null)
    return new Result(null, false);
  if(root == p && root==q){
    return new Result(root, true);
  }
  
  Result rx = commonAncestorHelper(root.left, p, q);
  if(rx.isAncestor){
    return rx;
  }
  
  Resutl ry = commonAncestorHelper(root.right, p, q);
  if(ry.isAncestor)
    return ry;
  
  if(rx.node !=null && ry.node !=null){
    return new Result(root, true);
  }
  else if(root==p || root==q){
    boolean isAncestor = rx.node !=null || ry.node !=null ? true: false;
    return new Result(root, isAncestor);
  }
  else
    return new Result(rx.node !=null ? rx.node: rx.node, false);
}

TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q){
  Result r = commonAncestorHelper(root,p, q);
  if(r.isAncestor) return r.node;
  return null;
}
