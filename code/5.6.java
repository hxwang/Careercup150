

//Step1: mask all odd bits with 10101010 in binary, i.e., 0xAA, then shift right by 1 putting them in even spots
//Step2: mask all even bits with 010101 in binary, i.e., 0x55, then shift left by 1 putting them in odd spots

public int swapOddEvenBits(int x){
  return ( ((x & 0xaaaaaaaa)>>1)| ((x & 0x55555555) << 1));
}
