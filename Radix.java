import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        String radix=sc.nextLine();
         if(radix.matches("[0-9]+")){
             System.out.println("The number is-Binary "+radix);
         }
         else if(radix.matches("[0-1]+")){
             System.out.println("The number is-Decimal "+radix);
         }
         else if(radix.matches("[0-7]+")){
             System.out.println("The number is-Octal "+radix);
         }
         else if(radix.matches("[0-9a-fA-F]+")){
             System.out.println("The number is-Hexadecimal "+radix);
         }
         else{
             System.out.println("The number is invalid "+radix);
         }
    }
}
