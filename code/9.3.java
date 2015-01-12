
// Elements are distinct
public static int magicFast(int[] array, int start, int end)
{
  if(end < start || start<0 || end>=array.length)
    return -1;
  int mid = (start+end)/2;
  
  if(array[mid] == mid) return mid;
  else if(array[mid] > mid)
    return magicFast(array, start, mid-1);
  else return magicFast(array, mid+1, end);
  
}

public static int magicFast(int[] array){

  return magicFast(array, 0, array.length-1);
  
}

//elements are not distinct

//check mid, if not array[mid] == midval
//left: search from start to Math.mid(mid-1, midval)
//right: search from Math.max(mid+1, midval)
