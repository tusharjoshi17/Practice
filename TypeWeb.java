import java.util.Scanner;

public class TypeWeb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Domain Name");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch (ext){
            case "com":
                System.out.println("Domain Name is .commercial");
                break;
            case "net":
                System.out.println("Domain Name is .network");
                break;
            case "org":
                System.out.println("Domain Name is .organization");
                break;
            default:
                System.out.println("Domain Name is .unknown");
                break;
        }
    }
        }
