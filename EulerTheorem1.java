package src;

import java.math.BigInteger;
import java.util.Scanner;

public class EulerTheorem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get input integers from user
        System.out.print("Enter a: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter n: ");
        BigInteger n = sc.nextBigInteger();

        // calculate phi(n)
        BigInteger phi_n = n.subtract(BigInteger.ONE);
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            if (n.gcd(i).equals(BigInteger.ONE)) {
                phi_n = phi_n.subtract(BigInteger.ONE);
            }
        }

        // calculate a^(phi(n)) (mod n)
        BigInteger result = a.modPow(phi_n, n);

        System.out.println(a + "^(phi(" + n + ")) = " + result + " (mod " + n + ")");
    }
}

