package src;

import java.util.Scanner;

public class ExtendedEuclidean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int[] result = extendedEuclidean(a, b);
        System.out.println("GCD: " + result[0]);
        System.out.println("S: " + result[1]);
        System.out.println("T: " + result[2]);
        input.close();
    }

    public static int[] extendedEuclidean(int a, int b) {
        int s = 0;
        int old_s = 1;
        int t = 1;
        int old_t = 0;
        int r = b;
        int old_r = a;

        while (r != 0) {
            int quotient = old_r / r;
            int temp = r;
            r = old_r - quotient * r;
            old_r = temp;
            temp = s;
            s = old_s - quotient * s;
            old_s = temp;
            temp = t;
            t = old_t - quotient * t;
            old_t = temp;
        }

        return new int[] { old_r, old_s, old_t };
    }
}