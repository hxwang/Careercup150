
//write a method to compute all permutation of a string

ArrayList<String> allPermutation(String s){
  ArrayList<String> rnt = new ArrayList<String>();
  StringBuffer sb = new StringBuffer();
  int depth = 0;
  dfs(rnt, sb, depth, s);
  return rnt;
}

public void dfs(ArrayList<String> rnt, StringBuffer sb, int depth, String s){
  if(depth==s.length()){
    rnt.add(sb.toString());
    return;
  }
  
  for(int i=0; i<s.length(); i++){
    String curr = s.substring(i,i+1);
    if(!sb.contains(curr)){
      sb.append(curr);
      dfs(rnt, sb, depth+1, s);
      sb.remove(curr);
    }
  }
}
