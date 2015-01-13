
/////////////////////////////// My implementation
//way0[i][j]: denote the number of ways to make i...j as 0
//way1[i][j]: denote the number of ways to make i...j as 1

//ways0[i][j] = ways[i][k] * ways[k+1][j]
//ways1[i][j] = ways[i][k] * ways[k+1][j]

//return ways[0][n-1]

////////////////////////////////Reference

public int count(String exp, int goal){
  int len = exp.length()/2+1;
  //symbox index: 2*i+1
  int[][] way0 = new int[len][len];
  int[][] way1 = new int[len][len];
  if(exp.length()==0) return 0;
  
  for(int i=0; i<len; i++){
    char c = exp.charAt(2*i);
    if(c=='0') way0[i][i] = 1;
    else way1[i][i] = 1;
  }
  
  for(int i=1; i<len; i++){
    for(int j=1; j<len; j++){
      for(int k=i+1; k<j; j++){
        char c = exp.charAt(2*k+1);
        if(c=='&'){
          way0[i][j] += way0[i][k]*(way0[k+1][j] + way1[k+1][j]);
          way0[i][j] += way1[i][k]*way0[k+1][j];
          way1[i][j] += way1[i][k]*way1[k+1][j];
        }
        else if(c=='|'){
          way0[i][j] += way0[i][k] * way0[k+1][j];
          way1[i][j] += (way0[i][k] + way1[i][k]) * way1[k+1][j]+ way1[i][k]*way1[k+1][j];
        }
        else if(c== '^'){
          way0[i][j] += (way1[i][k] * way1[k+1][j] + way0[i][k] * way0[k+1][j]);
          way1[i][j] += (way0[i][k] * way1[k+1][j] + way1[i][k] * way0[k+1][j]);
        }
      }
    }
  }
  
  if(goal ==0) return way0[0][len-1];
  else return way1[0][len-1];
}
