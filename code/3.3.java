

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

public int popAt(int index){
  return leftShift(index, true);
}

public int leftShift(int index, boolean removeTop){
  Stack stack = stacks.get(index);
  int removed_item;
  //remove top
  if(removeTop) removed_item = stack.pop();
  else removed_item = stack.removeBottom();
  if(stack.isEmpty)
    stacks.remove(index);
  else if(stacks.size()>index+1){
    //recursive shift to fill the empty slot
    int v = leftShift(index+1, false);
    stack.push(v);
  }
  return removed_item;
}
