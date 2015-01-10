

//My approach

public int convertNum(int a, int b){
  
  int rnt = 0;
  
  while( !(a==0 && b==0)){
    int num1 = a&1;
    int num2 = b&1;
    if(num1!=num2)
      rnt++;
    a>>1;
    b>>1;
  }
  
  return rnt;
}


//Reference approach: use XOR!

int bitSwapRequired(int a, int b){
  int count = 0;
  for(int c = a^b; c!=0; c>>1)
    count += c&1;
  
  return count;
}
