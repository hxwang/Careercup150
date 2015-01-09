
//use bfs

public enum State{
  Unvisited, Visited, Visiting
}

public static boolean search(Graph g, Node start, Node end){
  //operate as Queue
  LinkedList<Node> q = new LinkedList<Node>();
  
  for(node u: g.getNodes()){
    u.state = State.Unvisited;
  }
  
  start.state = State.visiting;
  q.add(start);
  Node u;
  
  while(!q.isEmpty()){
    u = q.removedFirst();
    if(u!=null){
      for(Node v: u.getAdjacent()){
        if(v.state == State.Unvisited){
          //found
          if(v==end) return true;
          else{
            v.state = State.visiting;
            q.add(v);
          }
        }
      }
      //mark as visited
      u.state = State.Visited;
    }
  }
  
  return false;
}
