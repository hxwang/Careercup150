
//DFS, use level to indicate the corresponding list to put the elements in
void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
  if(root == null) return; //base case
  
  LinkedList<TreeNode> list = null;
  if(lists.size() == level){ //level not contained in list
    list = new LinkedList<TreeNode>();
    lists.add(list);
  }
  else{
    list = list.get(level);
  }
  list.add(root);
  
  //recursive put left and right child
  createLevelLinkedList(root.left, lists, level+1);
  createLevelLinkedList(root.right, lists, level+1);
}


//Approach 2: BFS
//get next layers by traverse current layers
//update
ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
  ArrayList<LinkedList<TreeNode>> rnt = new ArrayList<LinkedList<TreeNode>>();
  curr = new LinkedList<TreeNode>();
  if(root!=null)
    curr.add(root);
  
  while(curr.size()>0){
    rnt.add(curr);
    LinkedList<TreeNode> next = new LinkedList<TreeNode>();
    for(TreeNode parent: curr){
      if(parent.left!=null)
        curr.add(parent.left);
      if(parent.right!=null)
        curr.add(parent.right);
    }
  }
  
  return rnt;
}
