class Outer{
    int x = 20;
    class Inner{
        int y = 10;
        void display(){
            System.out.println("Value of x is: "+x);
            System.out.println("Value of y is: "+y);
        }
    }
    void show(){
        Inner i = new Inner();
        i.display();
        System.out.println("Value of inner class is: "+i.y);
    }
}

public class NestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
    }
}
