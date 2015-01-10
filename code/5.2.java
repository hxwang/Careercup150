
//Approach 1
//each time, shift right to get the value
//e.g., r = 0.101*2 = 1.01

public static String printBinary(double num){
  if(num >=1 || num<=0) return "Error";
  
  StringBuilder binary = new StringBuilder();
  binary.append(".");
  while(num>0){
    if(binary.length() >=32) return "ERROR";
    
    double r = num*2;
    if(r >= 1){
      binary.append(1);
      num = r - 1;
    }
    else{
      binary.append(0);
      num = r;
    }
  }
  
  return binary.toString();
}

//Approach 2: compare with 0.5, 0.25 etc..

public static String printBinary(double num){
  if(num >=1 || num<=0) return "ERROR";
  
  StringBuilder sb = new StringBuilder();
  double frac = 0.5;
  while(num > 0){
    if(sb.length()>=32) return "ERROR";
    //compare and append
    if(num >= frac){
      sb.append("1");
      num -= frac;
    }
    else{
      sb.append("0");
    }
    //update fractor
    frac /=2;
  }
  return sb.toString();
}
