import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            num /= 10;
            System.out.print(remainder);
        }
    }
}
