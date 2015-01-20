

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


//Assume you have 
