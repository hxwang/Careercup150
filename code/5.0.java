
//Bit operation

//Get Bit: get the i-th bit of num
boolean getBit(int num, int i){
  return ((num & (1<<i))!=0);
}

//Set Bit: set the i-th bit of num as 1
int setBit(int num, int i){
  return num | (1<<i);
}

//Clear bit: clear the ith bit
int clearBit(int num, int i){
  int mask = ~(1<<i);
  return num & mask;
}

//clear all bits from the most significiant bit through i(inclusive), 
int clearBitMSBThroughI(int num, int i){
  int mask =  (1<<i)-1;
  return num & mask;
}

//clear akk bits from i through 0 (inclusive)
int clearBitsIthough0(int num, int i){
  int mask = ~((1<<(i+1)-1));
  return num & mask;
}
