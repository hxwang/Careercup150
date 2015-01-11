

///////////////////////////////////////// My design
//each pieces of jigsaw puzzle has an id
//a board contains a set of pieces of sigsaw
//algorithm: try to match each pieces, find their neighbourhoods

//////////////////////////////////////////// Reference

//Code Not complete 
//each piece has 4 edges
class Edge{
  enum Type {inner, outer, flat}
  Piece parent;
  Type type;
  int index; //index into pience.edges
  Edge attached_to; //relative position
  
  //return true ifthe two peices should be attached to each other
  boolean fitWith(Edge edge) {...};
}

Class Piece{
  Edge[] edges;
  boolean isCorner();
}

class Puzzle{
  Piece[] pieces; //remaining pieces left to put away
  Piece[][] solution;
  
  Edge[] innerm oter, flats;
  Piece[] corners;
  
  void sort() {}
  void solver() {}
}


////////////////////////////////////////
//Algorithm to solve the puzzle
void sort(){
  for each Piece p in pieces{
    if(p has two flag edges) then add  p to corners;
    for each edge in p.edges{
      if edge is inner then add to inners
      if edge i outer then add to outers
    }
  }
}

//In spiral manner
