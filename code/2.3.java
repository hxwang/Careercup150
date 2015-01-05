//copy the data from the next node to current node, and delete the next node

public static boolean deleteNode(LinkedListNode n){
  if(n == null || n.next == null)
    return false;
  
  LinkedListNode next = n.next;
  n.data = next.data;
  n.next = next.next;
  
  return true;
}
