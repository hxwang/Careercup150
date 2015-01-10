

//by observer the rountine

//if count(0)<= count(1), LSB(v) =0
//else LSB(v) =1

//in the proces: discard all the numbers where LSB_i(x) != LSB_i(v)??

//run time complexity: O(n)

public int findMissing(ArrayList<BitInteger> array){
  //BitInteger.INTEGER_SIZE-1 corresponds to LSB
  return findMissing(array, BitInteger.INTEGER_SIZE-1);
}

public int findMissing(ArrayList<BitInteger> input, int column){
  if(column < 0) return 0;
  
  ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(input.size()/2);
  ArrayList<BitInteger> zerosBits = new ArrayList<BitInteger>(input.size()/2);
  
  for(BitInteger t: input){
    if(t.fetch(column) == 0)
      zeroBits.add(t);
    else onesBits.add(t);
  }
  
  //recursive compute either a 0 or a 1
  if(zerosBits.size()<=0 onesBits.size()){
    int v = findMissing(zeroBits, column-1);
    return (v<<1) | 0;
  }
  else{
    int v = findMissing(oneBits, column-1);
    return (v<<1)|1;
  }
}



