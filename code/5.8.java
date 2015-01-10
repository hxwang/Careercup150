

//identify the start of byte, and set one byte at a time to 0xFF

void drawLine(byte[] screen, int width, int x1, int x2, int y){
  int start_offset = x1 % 8;
  int first_full_byte = x1/8;
  //adjust the start of byte
  if(start_offset !=0)
    first_full_byte++;
    
  int end_offset = x2 % 8;
  int last_full_byte = x2/8;
  if(end_offset != 7)
    last_full_byte--;
  
  //set full type
  for(int i = first_full_byte; i<=last_full_byte; i++){
    screen[(width/8)*y+b] = (byte)0xFF;
  }
  
  //create masks for the start and end of line
  byte start_mask = (byte)(0xFF >> start_offset);
  byte end-mask= (byte)~(0xFF >> (end_offset +1));
  
  //set start and end of line
  if((x1/8) == (x2/8)){
    //x1 and x2 are in the same byte 
    byte  mask = (byte)(start_mask & end_mask);
    screen[(width/8)*y +(x1/8)] |=mask;
  }
  else{
    if(start_offset !=0){
      int byte_number = (width/8)*y + first_full_bypte - 1;
      screen[byte_number] |= start_mask;
    }
    if(end_offset !=7){
      int byte_number = (width/8)*y + last_full_byte + 1;
      screen[byte_number] |= end_mask;
    }
  }
}
