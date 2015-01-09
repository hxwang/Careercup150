

class SetOfStacks{
  ArrayList<Stack> stacks = new ArrayList<Stacl>();
  public void push(int v) {...}
  public void pop() {...}
}

public void push(int v){
  Stack last = getLastStack();
  if(last!=null && !last.isFull()){
    //add to last stack
    last.push(v);
  }
  else{
    Stack stack = new Stack(capacity);
    stack.push(v);
    stacks.add(stack);
  }
}

public int pop(){
  Stack last = getLastStack();
  int v = last.pop();
  if(last.size()==0) stacks.remove(stacks.size()-1);
  return v;
}
