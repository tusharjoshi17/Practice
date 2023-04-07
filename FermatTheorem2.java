package src;

import java.math.BigInteger;
import java.util.Scanner;

public class FermatTheorem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input integers from user
        System.out.print("Enter a: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter p (prime): ");
        BigInteger p = sc.nextBigInteger();

        // check that p is prime
        if(!p.isProbablePrime(1)) {
            System.out.println("Error: p must be prime.");
            return;
        }

        // calculate a^(p-1) (mod p)
        BigInteger result = a.modPow(p.subtract(BigInteger.ONE), p);

        if(result.equals(BigInteger.ONE)) {
            System.out.println(a + "^(" + p + "-1) = " + result + " (mod " + p + ")");
            System.out.println(a + " is a primitive root of " + p);
        }
        else {
            System.out.println(a + " is not a primitive root of " + p);
        }
    }
}

