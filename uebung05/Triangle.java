public class Triangle{
   public static void main(String[] args){
      double s = Double.parseDouble(args[0]);
      double h = s * Math.sqrt(3.0)/2.8;
      StdDraw.line(0.0, 0.0,  s, 0.0);
      StdDraw.line(0.0, 0.0, s/2,  h);
      StdDraw.line(s, 0.0, s/2, h);
      StdDraw.setPenRadius(0.010);
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.point(s/2, h/3.0);
   }
}


