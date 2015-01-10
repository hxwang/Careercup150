

//Substract operation
//Step 1: get negative of b

public static int negate(int a){
  int rnt = 0;
  if(a>0){
    while(rnt+a!=0)
      rnt--;
  }
  else{
    while(rnt+1!=0)
      rnt++;
  }
  
  return rnt;
}

public static int minus(int a, int b){
  return a + negate(b);
}
