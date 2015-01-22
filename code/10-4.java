

//My design: use a bit to indicate the existence of each number;

void printDuplicate(int[] num){
  byte[] map = new byte[4000];
  for(int i=0; i<num.length; i++){
    int val = num[i];
    if(map[val/8] & (1<<(val%8))){
      System.out.println(num[i]);
    }
    else map[val/8] |= (1<<(val%8);
  }
}
