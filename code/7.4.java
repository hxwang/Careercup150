

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


//Multiplication
public static int multiply(int a, int b){
  
  //make the multiply more efficient
  if(a<b) return mutiply(b,a);
  
  int sum = 0;
  for(int i = Math.abs(b); i>0; i--)
    sum += a;
  
  if(b<0) sum = negate(sum);
  
  return sum;
}

//division
//adding b to itself, until exceed a
public int divide(int a, int b) throws java.lang.ArithmeticException{
  
  if(b==0)
    throws java.lang.ArithmeticException("ERROR");
    
  int absa = abs(a);
  int absb = abs(b);
  
  int product = 0;
  int x = 0;
  while(product + absb <= absa){
    product += absb;
    x++;
  }
  
  if( (a<0 && b<0) || (a>0 && b>0))
    return x;
  else return negate(x);
}


