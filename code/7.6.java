/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public Line maxPoints(Point[] points) {
        
        if(points.length == 0) return 0;
        
        Line bestline = null;
        HashMap<Line, Integer> line_count = new HashMap<Line, Integer>();
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                Line line = new Line(points[i], points[j]);
                if(!line_count.containsKey(line))
                    line_count.put(line,0);
                else line_count.put(line, line_count.get(line)+1);
                if(bestline==null)
                    bestline = line;
                else if(line_count.get(line)> line.count.get(bestline)) bestline=line;
            }
        }
        
        return bestline;
    }
    
    
    
}



 class Line{
       private static double epsilon = 0.0001;
       public double slope;
       public double intercept;
       private boolean infinite_slope = false;
       
       public Line(Point p, Point q){
           if(Math.abs(p.x - q.x) > epsilon){
               slope = (p.y-q.y)/(p.x-q.x);
               intercept = p.y - slope*p.x;
           }
           else{
               infinite_slope = true;
               intercept = p.x;
           }
       }
       
       
       public boolean isEqual(double a, double b){
           return ( Math.abs(a-b) < epsilon );
       }
       
       @Override
       public int hashCode(){
           int s1 = (int)(slope*1000);
           int in = (int)(intercept*1000);
           return s1|in;
       }
       
       @Override
       public boolean equals(Object o){
           Line l = (Line) o;
           if(isEqual(l.slope, slope) && isEqual(l.intercept, intercept) && infinite_slope == l.infinite_slope){
               return true;
           }
           return false;
       }
}

 

