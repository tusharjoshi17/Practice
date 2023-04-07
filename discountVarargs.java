import java.util.Scanner;

public class discountVarargs {
    double discount(double... P) {
        double sum = 0;
        for (int i = 0; i < P.length; i++) {
            sum = sum + P[i];
            if (sum < 500) {
                return sum * 0.10;
            } else if (sum >= 500 && sum < 1000) {
                return sum * 0.15;
            } else if (sum >= 1000 && sum < 5000) {
                return sum * 0.20;
            } else if (sum >= 5000) {
                return sum * 0.25;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        System.out.println("Enter the price of items");
        double[] P = new double[n];
        for (int i = 0; i < n; i++) {
            P[i] = sc.nextDouble();
        }
        discountVarargs dv = new discountVarargs();
        double discount = dv.discount(P);
        System.out.println("Discount is " + discount);
    }
}

//        discountVarargs dv = new discountVarargs();
//        double[] P = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
//        double discount = dv.discount(10);
//        System.out.println(discount + " ");

