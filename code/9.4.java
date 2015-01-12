

//////////////////////////////// My implementation
ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set){
  ArrayList<ArrayList<Integer>> rnt = new ArrayList<ArrayList<Integer>>();
  ArrayLIst<Integer> tmp = new ArrayList<Integer>();
  int start = 0;
  dfs(rnt, tmp, set,start);
}

public void dfs(ArrayList<ArrayList<Integer>> rnt, ArrayList<Integer> tmp, ArrayList<Integer> set, int start){
  if(start==set.size()){
    rnt.add(new ArrayList<Integer>(tmp));
    return;
  }
  
  for(int i=start; i<set.size(); i++){
    tmp.add(set.get(i));
    dfs(rnt, tmp, set, i);
    tmp.remove(set.get(i));
  }
}
