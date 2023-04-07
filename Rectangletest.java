

class Rectangle2{
    private double length;
    private double breadth;
    public Rectangle2(){
        length=1;
        breadth=1;
    }
    public Rectangle2(double l,double b){
        setLength(l);
        setBreadth(b);
    }
    public Rectangle2(double s){
        length=breadth=s;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth()
    {
        return breadth;
    }
    public double getLength()
    {
        return length;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }

}

public class Rectangletest {
    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2(10,20);
        System.out.println("Area of rectangle is " + r1.area());
        System.out.println("Perimeter of rectangle is " + r1.perimeter());
        System.out.println("Is rectangle square? " + r1.isSquare());
//        r1.setBreadth(2);
//        r1.setLength(3);
//        System.out.println(r1.getLength());
//        System.out.println(r1.getBreadth());
    }
}
