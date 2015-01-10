
//Step 1: create mask with j...i as 0, other bits as 1
//Step 2: shift M as it lines up bits j through i
//Step 3: merge M and N

int updateBits(int n, int m, int i, int j){
  int allOnes = ~0;
  int left = allOnes << (j+1); //1100000
  int right = 1<<i - 1; //00000011
  
  //step 1
  int mask = left | right;
  
  int n_cleared = n & mask;
  //step 2
  int m_shifted = m<<i;
  //step 3
  return n_cleared | m_shifted;
}
