

//dfs
void search(Node root){
  if(root==null) return;
  visit(root);
  //need to mark if visited
  root.visited = true;
  foreach(Node n in root.adjacent){
    if(n.visited == false)
      search(n);
  }
}
