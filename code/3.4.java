
public class Tower{
  private Stack<Integer> disks;
  private int index;
  public Tower(int i){
    disks = new Stack<Integer>();
    index = i;
  }
  
  public int index(){
    return index;
  }
  
  public void add(int d){
    if(!disk.isEmpty() && disk.peek()<=d)
      System.out.println("Error placing disk" + d);
    else disks.push(d);
  }
  
  public void moveTopTo(Tower t){
    int top = disks.top();
    t.add(top);
    System.out.println("Move disk" + top + "from" + index() + "to" + t.index());
    
  }
  
  public void moveDisks(int n, Tower destination, Tower buffer){
    if(n>0){
      //move n-1 disks from Tower 1 to Tower 2, using Tower 3
      moveDisks(n-1, buffer, destination);
      //move top from Tower 1 to Tower 3
      moveTopTo(destination);
      //move n-1 disks from Tower 2 to Towre 3, using Tower 1 as buffer
      buffer.moveDisks(n-1, destination, this);
    }
  }
}


public static void main(String[] args){
  int n = 3;
  Tower[] towers = new Tower[n];
  for(int i=0; i<3; i++)
    towers[i] =  new Tower(i);
  for(int i=n-1; i>=0; i--)
    towers[0].add(i);
  
  towers[0].moveDisks(n, towers[2], towers[1]);
}
