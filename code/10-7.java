

public class Cache{
  public static int MAX_SIZE = 10;
  public Node head, tail;
  public HashMap<String, Node> map;
  public int size = 0;
  
  public Cache(){
    map = new HashMap<String, Node>();
  }
  
  //move node to front of linked list
  public void moveToFront(Node node){...}
  public void moveToFront(String query){...}
  
  //remove node from linked list
  public void removeFromLInkedList(Node node) {...}
  
  //get the results from cache, and update linked list
  public String[] getResult(String query){
    if(!map.containsKey(query)) return null;
    
    Node node = map.get(query);
    movetoFront(node);
    return node.results;
  }
  
  //insert results into linked list and hash
  public void insertResults(String query, String[] results){
    if(map.containsKey(query)){
      Node node = map.get(query);
      node.results = results;
      moveToFront(node);
      return;
    }
    
    Node node = new Node(query, results);
    moveToFront(node);
    map.put(query, node);
    
    if(size > MAX_SIZE){
      map.remove(tail.query);
      removeFromLinkedList(tail);
    }
  }
  
  
}
