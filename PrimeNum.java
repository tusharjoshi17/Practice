import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int num){
        for(int i = 2; i<num/2;i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            System.out.println("Enter the number to check: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if(isPrime(n)){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
    }
}

