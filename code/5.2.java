
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
