

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


//bfs
void search(Node root){
  //use a queue to maintain the elements that are to be visited
  Queue queue = new Queue();
  root.visited = true;
  visit(root);
  queue.enqueue(root); //Add to the end of the queue
  
  while(!queue.isEmpty()){
    Node r = queue.dequeue();
    foreach (Node in r.adjacent){
      if(n.visited == false){
        visit(n);
        n.visited = true;
        queue.enqueue(n);
      }
    }
  }
}
