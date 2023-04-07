import java.util.Scanner;

class Rectangle1 {
    public int length;
    public int breadth;

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    boolean isSquare() {
        if (length == breadth)
            return true;
        else
            return false;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        System.out.println("Enter the length of the rectangle");
        Scanner l = new Scanner(System.in);
        r1.length = l.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        Scanner b = new Scanner(System.in);
        r1.breadth = b.nextInt();
        System.out.println("Area of the rectangle is " + r1.area());
        System.out.println("Perimeter of the rectangle is " + r1.perimeter());
        if (r1.isSquare()) {
            System.out.println("The rectangle is a square");
        } else {
            System.out.println("The rectangle is not a square");
        }
    }
}
