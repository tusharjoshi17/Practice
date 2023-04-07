import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Menu Calculator!");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.println("5. QUIT");
        System.out.println("Enter your choice in words: ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "ADD" -> {
                System.out.println("Enter 2 no: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("The sum is: " + (a + b));
            }
            case "SUB" -> {
                System.out.println("Enter 2 no: ");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println("The difference is: " + (c - d));
            }
            case "MUL" -> {
                System.out.println("Enter 2 no: ");
                int e = sc.nextInt();
                int f = sc.nextInt();
                System.out.println("The product is: " + (e * f));
            }
            case "DIV" -> {
                System.out.println("Enter 2 no: ");
                int g = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("The quotient is: " + (g / h));
            }
            case "QUIT" -> System.out.println("Thank you for using the Menu Calculator!");
            default -> System.out.println("Invalid choice!");
        }
    }
}
