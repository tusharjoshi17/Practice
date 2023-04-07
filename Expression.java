import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        System.out.println("Enter three side of triangles: ");
        float a,b,c,s,area;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2f;
        area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);
    }
}
