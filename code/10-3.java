

/*
- My idea
  - divide the data into chunks
  - sort the number in each chunk, for the continue numbers, e.g.,  1 [3 4 5 6] 9, only keep [1-2] [7-9] as valid number periods
  - merge the intervals in each chunk
  - the first availale number is at the head of the interval
*/


// Assume you have 1GB memory
// Use one bit to indicate the presence of an integer, thus 2^32 need 2^32/8 bytes = 0.5GB

public int findMissingNumber(){
  long numberOfInts = (long)(Integer.MAX_VALUE) + 1;
  byte[] bitmap = new byte[(int)(numberOfInts/8)];
  
  Scanner s = new Scanner(new FileReader("file.txt"));
  while (s.hasNextInt()){
    int n = s.nextInt();
    bitmap[n/8] |= (1 << (n%8));
  }
  
  
  for(int i=0; i<=Integer.MAX_VALUE; i++){
    if(bitmap[i/8] & (1 << (i%8)) == 0)
      return i;
  }
  
  return -1;
}


//Assume you have 1MB memory, we do it in to passes
//First pass: we partition number into blocks, and count the number in each block. If the count is less the block range, then it means there are missing number in this block

//Second pass: we use the approach similar to above one to find the missing number

// # of blocks * 4 <= 10M = 2^23; thus # of blocks <= 2^21; thus range of blocks >= 2^32 / 2^21 = 2^11
// range of blocks/8 <= 10M = 2^23; thus range of block <= 2^26

int findMissingNum2(){
  int blocksize = 1 << 19; //means 2^20
  int blocknum = 1 << 11;
  int[] blocks = new int[blocknum];
  
  Scanner s = new Scanner(new FileReader("file.txt"));
  while(s.hasNextInt()){
    int n = s.nextInt();
    blocks[n/blocksize]++;
  }
  
  int starting = 0;
  for(int i=0; i<blocks.length; i++){
    if(blocks[i] < blocksize){
      starting = i*blocksize;
      break;
    }
  }
  
  byte[] bitmap = new byte[blocksize/8];
  s = new Scanner(new FileReader("file.txt"));
  while(s.hasNextInt()){
    int n = s.nextInt();
    if(n>=starting && n<starting + blocksize){
      bitmap[(n-starting)/8] |=  (1 << ( (n-starting)%8));
    }
  }
  
  for(int i=starting; i<starting + blocksize; i++){
    if(bitmap[(i-starting)/8] & (1 << (i-starting)%8) == 0)
      return i;
  }
  
  return -1;
  
}
