package src;

import java.math.BigInteger;
import java.util.Scanner;

public class EulerTheorem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input integers from user
        System.out.print("Enter a: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter n: ");
        BigInteger n = sc.nextBigInteger();

        // calculate a mod n
        BigInteger result = a.mod(n);

        System.out.println(a + "^(phi(" + n + ")) = " + a + " mod " + n + " = " + result);
    }
}

