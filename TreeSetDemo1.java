package src;

import java.util.TreeSet;
class Point implements Comparable
{
   int x;
   int y;
   public Point(int x, int y)
   {
       this.x = x;
       this.y = y;
   }
   public String toString()
   {
       return x + " " + y;
   }
    public int compareTo(Object o)
    {
         Point p = (Point)o;
         if(x < p.x)
              return -1;
         else if(x > p.x)
              return 1;
         else
         {
              if(y < p.y)
                return -1;
              else if(y > p.y)
                return 1;
              else
                return 0;
         }
    }
}

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Point> p = new TreeSet<>();
        p.add(new Point(10,30));
        p.add(new Point(10,40));
        p.add(new Point(10,50));
        System.out.println(p);
    }
}
