
//Approach 1: compare pre-order and in-order traverse of T1 and T2,
//if in both cases, T2's traverse result is a substring of T1, then true
//note that we need to mark the Null values in order to tell left and right child

//drawback: the overhead of creating a copy of both trees may require too much memory
//space complexity: O(n1+n2)
//time complexity: O(n1+n2)

//Approach 2: test each node in T1 to see if it can be the root of the subtree
//Space complexity: O(log n+ log m)
//Time complexity: O(n1 + n2*k): not every node in t1 match with the root of t2; k is the amount that matches

bolean containsTree(TreeNode t1, TreeNode t2){
  //the empty tree is always a subtree
  if(t2==null)
    return true;
  return subTree(t1,t2);
}

//check each node in r1, to see if it is root of subtree of r2
boolean subTree(TreeNode r1, TreeNode r2){
  if(r1==null)
    return false; 
  if(r1.data == r2.data){
    if(matchTree(r1,r2)) return true;
  }
  
  return (subTree(r1.left, r2) || subTree(r1.right, r2));
}

//check if r1 and r2 are the same
boolean matchTree(TreeNode r1, TreeNode r2){
  if(r1==null && r2==null)
    return true;
  if(r1 ==null || r2==null) return false;
  
  if(r1.data != r2.data) return false;
  return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
}
