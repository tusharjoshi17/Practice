import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int rem,rev=0,m=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==m){
            System.out.println("It's Palindrome");
        }
        else{
            System.out.println("It's not Palindrome");
        }
    }
}
