
//////////// My implementation

public int ways(int X, int Y, boolean[][] cango){
  int[][] ways = new int[X+1][Y+1];
  ways[1][1] = 1;

  for(int i=1; i<=X; i++){
    for(int j=1; j<=Y; j++){
      if(i==1 && j==1) ways[1][1] = cango[0][0]==true? 1: 0;
      else ways[i][j] = cango[i-1][j-1]==true ? ways[i-1][j] + ways[i][j-1] : 0;
      }
  }
  
  return ways[X][Y];
}

///////////////////////////
//The problem try to output solution
public boolean getPath(int x, int y, ArrayList<Point> path, HashTable<Point, Boolean> cache){
  
  Point p = new Point(x,y);
  if(cache.containsKey(p)) return cache.get(p);
  
  path.add(p);
  
  if(x==0 && y==0) return true; //found a path
  boolean success = false;
  
  if(x>=1 && isFree(x-1,y)){
    success = getPath(x-1, y, path, cache);
  }
  
  if(!success && y>=1 && isFree(x,y-1)){
    success = getPath(x, y-1, path, cache);
  }
  
  if(!success)
    path.remove(p);
  cache.put(p, success);
  return success;
}
