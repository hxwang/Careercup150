

//maintain 3 queues for 3, 5, 7 respectively
//each time each the min among the queue, dequeue old numbers, and enqueue new numbers

public static int getkThMagicNumber(int k){
  if(k<0) return 0;
  int val = 0;
  Queue<Integer> q3 = new LinkedList<Integer>();
  Queue<Integer> q5 = new LinkedList<Integer>();
  Queue<Integer> q7 = new LinkedList<Integer>();
  
  //init
  q3.add(1);
  
  for(int i=0; i<=k; i++){
    int v3 = q3.size()>0? q3.peek(): Integer.MAX_VALUE;
    int v5 = q5.size()>0? q5.peek(): Integer.MAX_VALUE;
    int v7 = q7.size()>0? q7.peek(): Integer.MAX_VALUE;
    
    //select min
    val = Math.min(v3, Math.min(v5,v7));
    
    //insert new value to the corresponding queue
    if(val==v3){
      q3.remove();
      q3.add(val*3);
      q5.add(val*5);
      q7.add(val*7);
    }
    else if(val==v5){
      q5.remove();
      q5.add(5*val);
      q7.add(val*7);
    }
    else if(val==v7){
      q7.remove();
      q7.add(val*7);
    }
    
  }
  
  return val;
}
