

public Node createTree(int[] num){
  return helper(num, 0, num.length-1);
}

public Node helper(int[] num, int left, int right){
  if(left>right) return null;
  if(left==right) return new Node(num[left]);
  int mid = (left+right)/2;
  Node rnt = new Node(num[mid]);
  rnt.left = helper(num, left, mid-1);
  rnt.right = helper(num, mid+1, right);
  return rnt;
}
