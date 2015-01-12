
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
