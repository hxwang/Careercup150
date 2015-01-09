
//maintain two stacks
//stackNewest has the newest element on top
//while stackOldest has the oldest element on top

public class MyQueue<T>{
  Stack<T> stackkNewest, stackOldest;
  
  public MyQueue(){
    stackNewest = new Stack<T>();
    stackOldest = new Stack<T>();
  }
  
  public int size(){
    return stackNewest.size() + stackOldest.size();
  }
  
  public void add(T value){
    //push onto stackNewest
    stackNewest.push(value);
  }
  
  public void shiftStacks(){
    if(stackOldest.isEmpty()){
      while(!stackNewest.isEmpty())
        stackOldest.push(stackNewest.pop());
    }
  }
  
  public T peek(){
    shiftStacks();
    return stackOldest.peek();
  }
  
  public T remove(){
    shiftStacks();
    return stackOldest.pop();
  }
}
