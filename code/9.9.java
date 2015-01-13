
//dynamic programming
//stack_map.get(box) store the max-height stack using box as bottom

public ArrayList<Box> createStackDP(Box[] boxes, Box bottom, HashMap<Box, ArrayList<Box>> stack_map){
  if(bottom!=null && stack_map.containsKey(bottom))
    return stack_map.get(bottom);
  
  int max_height = 0;
  ArrayList<Box> max_stack = null;
  for(int i=0; i<boxes.length; i++){
    if(boxes[i].canBeAbove(bottom)){
      ArrayList<Box> new_stack = createStackDP(boxes, boxes[i], stack_map);
      int height = stackHeight(new_stack);
      if(new_height > max_height){
        max_stack = new_stack;
        max_height = new_height;
      }
    }
  }
  
  if(max_stack == null) max_stack = new ArrayList<Box>();
  if(bottom != null) max_stack.add(0, bottom);
  stack_map.put(bottom, max_stack);
  
  return (ArrayList<Box>)max_stack.clone();
}
