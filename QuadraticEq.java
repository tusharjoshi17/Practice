import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        System.out.println("Enter three number for Quadratic Eq: ");
        int a,b,c;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        r1=(-b+ sqrt)/(2*a);
        r2=(-b- sqrt)/(2*a);
        System.out.println("Root are "+r1+" "+r2);
    }
}
