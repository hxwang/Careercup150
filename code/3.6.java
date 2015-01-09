
//stack s contains unsorted elements
//stack r used to contain sorted elements

public static Stack<Integer> sort(Stack<Integer> s){
  
  Stack<Integer> r = new Stack<Integer>();
  while(!s.isEmpty()){
    int tmp = s.pop();
    //push tmp to the right place in r
    while(!r.isEmpty() && r.peek() > tmp){
      s.push(r.pop());
    }
    r.push(top);
  }
  
  return r;
}
