

//connect two heart of the squares


public class Square{
  
  public Point Middle(){
    return new Point((this.left+this.right)/2.0, (this.top + this.bottom)/2.0);
  }
  
  //return the point where the line segment connecting mid1 and mid2 intersect the edge of square 1.
  public Point extend(Point mid1, Point mid2, double size){
    double xdir = mid1.x < mid2.x ? -1: 1;
    double ydir = mid1.y < mid2.y ? -1: 1;
    
    //the line will hit the same x
    if(mid1.x == mid2.x){
      return new Point(mid1.x, mid1.y + ydir * size/2.0);
    }
    
    double slope = (mid1.y - mid2.y)/(mid1.x - mid2.x);
    double x1 = 0;
    double t1 = 0;
    
    if(Math.abs(slope) == 1){
      x1 = mid1.x + xdir* size/2.0;
      y1 = mid1.y + ydir* size/2.0;
    }
    //shallow slope
    else if(Math.abs(slope) < 1){
      x1 = mid1.x + xdir*size/2.0;
      y1 = slope*(x1-mid1) + mid1.y;
    }
    //steep slope
    else{
      y1 = mid1.y = ydir * size/2.0;
      x1 = (y1-mid1.y)/slope + mid1.x;
    }
    
    return new Point(x1, y1);
  }
  
  //
  public Line cut(Square other){
    Point middle_s = this.middle();
    Point middle_t = other.middle();
    if(middle_s.isEqual(middle_t)){
      Square bigger = bottom-top > other.bottom - other.top? this: other;
      return new Line(new Point(bigger.left, bigger.top), new Point(bigger.right, bigger.bottom));
    }
    else{
      Point point_s = extend(middle_s, middle_t, this.right - this.left);
      Point point_t = extend(middle_t, middle_s, other.right - other.left);
      return new Line(point_s, point_t);
    }
  }
  
  
  
}
