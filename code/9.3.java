
public int magicIndex(int left, int right, int[] A){
  if(left>right) return -1;
  if(left == right){
    if(A[left] == left) return left;
    else return -1;
  }
  
  int mid = (left+right)/2;
  if(A[mid] == mid) return mid;
  if( (A[left] < left && A[mid]>mid) || (A[left]>left && A[mid]<mid))
    return magicIndex(left, mid-1, A);
  else if( (A[mid]<mid && A[right]>right) || (A[mid]>mid && A[right] < right))
    return magicIndex(mid+1, right, A);
  else return -1;
}
