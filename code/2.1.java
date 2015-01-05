
//time complexity: O(n^2)

public static void deleteDups(LinkedListNode head){
  if(head == null) return head;
  
  LinkedListNode current = head;
  while(current != null){
    LinkedListNode runner = current;
    while(runner.next!=null){
      if(runner.next.data == current.data)
      //delete duplicate
      runner.next = runner.next.next;
      else
      //go to next;
      runner = runner.next;
  }
  
  current = current.next;

}
