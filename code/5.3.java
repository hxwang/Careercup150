

//Get next number
//Step 1: computer first trailing-0, i.e.,  011..., 
//denote the position of 0 as p, and c0 and c1 as the number of 0 and 1 in the right-side of p

//Step 2: set p as 1
//Step 3: set clear bits to the right of p
//Step 4: add-in c1-1 ones

public getNext(int n){
  //compute c0 and c1
  int c = n;
  int c0 = 0;
  int c1 = 0;
  while( ((c&1)==0) && (c!=0)){
    c0++;
    c>>=1;
  }
  
  while( (c&1)==1){
    c1++;
    c>>=1;
  }
  
  //error
  if(c0+c1==31 || c0+c1==0)
    return -1;
  
  int p = c0 + c1;
  
  n |= (1<<p); //step 2
  n &= ~((1<<p)-1); //step3
  n |= (1<< (c1-1))-1; //step4
  return n;
}
