import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWIthResources {
    static void Divide() throws ArithmeticException, FileNotFoundException {
        try(FileInputStream fi = new FileInputStream("I:\\Numbers.txt"); Scanner sc = new Scanner(fi);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Divide();
    }
}
