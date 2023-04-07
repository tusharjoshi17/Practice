import java.util.Scanner;

public class validateNameAge {
    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean validate(int age){
        return age > 3 && age < 15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        validateNameAge vna = new validateNameAge();
        if(vna.validate(name) && vna.validate(age)){
            System.out.println("You're eligible to take admission");
        }
        else{
            System.out.println("Not eligible to take admission");
        }
    }
}
