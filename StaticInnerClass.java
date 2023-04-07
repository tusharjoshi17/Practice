
class outer1{
    static int x = 10;
    int y = 20;
    static class show{
        void display(){
            System.out.println("Value of x is: "+x);
            // System.out.println("Value of y is: "+y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        outer1.show s = new outer1.show();
        s.display();
    }
}
