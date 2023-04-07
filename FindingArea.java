import java.util.Scanner;

public class FindingArea {
    static int area(double radius){
        return (int) (Math.PI*radius*radius);
    }
    static int area(int length, int breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("Area of circle is: "+area(radius));
        System.out.println("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = scanner.nextInt();
        System.out.println("Area of rectangle is: "+area(length,breadth));
    }
}
