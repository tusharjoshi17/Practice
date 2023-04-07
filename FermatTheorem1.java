package src;

import java.math.BigInteger;
import java.util.Scanner;

public class FermatTheorem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input integers from user
        System.out.print("Enter a: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter n: ");
        BigInteger n = sc.nextBigInteger();

        // check that n is greater than 2
        if (n.compareTo(BigInteger.valueOf(2)) <= 0) {
            System.out.println("Error: n must be greater than 2.");
            return;
        }

        // calculate a^(n-1) (mod n)
        BigInteger result = a.modPow(n.subtract(BigInteger.ONE), n);

        if(result.equals(BigInteger.ONE)) {
            System.out.println(a + "^(" + n + "-1) = " + result + " (mod " + n + ")");
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}

