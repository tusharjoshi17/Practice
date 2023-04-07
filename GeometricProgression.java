import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting input: ");
        int a=sc.nextInt();
        System.out.println("Enter common difference: ");
        int d=sc.nextInt();
        System.out.println("Enter a number for terms: ");
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term = term*d;
        }
    }
}
