

//if slope different < &epsilon; and y-intercept > &epsilon, then the two lines are parallel

public class Line{
  //since slop and yintercept, thus use epsilon instead of ==
  static double epsilon = 0.000001;
  public double slope;
  public double yintercept;
  
  public Line(double s, double y){
    slope = s;
    yintercept = y;
  }
  
  public boolean intersect(Line line2){
    return Math.abs(slope - line2.slope) > epsilon ||
      Math.abs(yintercept - line2.yintercept) < epsilon;
  }
}
