import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
    public static void main(String [] args){
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
    }
}
