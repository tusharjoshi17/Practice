package src;

import java.math.BigInteger;
import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get prime numbers from user
        System.out.print("Enter a prime number (p): ");
        BigInteger p = sc.nextBigInteger();
        System.out.print("Enter another prime number (q): ");
        BigInteger q = sc.nextBigInteger();

        // calculate n and phi(n)
        BigInteger n = p.multiply(q);
        BigInteger phi_n = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        // choose an integer e such that 1 < e < phi(n) and gcd(e, phi(n)) = 1
        BigInteger e = BigInteger.valueOf(2);
        while(phi_n.gcd(e).intValue() > 1) {
            e = e.add(BigInteger.ONE);
        }

        // calculate d such that e*d = 1 (mod phi(n))
        BigInteger d = e.modInverse(phi_n);

        // input message
        System.out.print("Enter the message: ");
        BigInteger m = sc.nextBigInteger();

        // encryption
        BigInteger c = m.modPow(e, n);

        // decryption
        BigInteger m_dec = c.modPow(d, n);

        System.out.println("Original message: " + m);
        System.out.println("Encrypted message: " + c);
        System.out.println("Decrypted message: " + m_dec);
    }
}
