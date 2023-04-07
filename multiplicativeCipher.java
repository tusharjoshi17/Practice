import java.util.*;

class multiplicativeCipher
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String msg = sc.nextLine();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        String cipher = "";
        for(int i=0;i<msg.length();i++)
        {
            int temp = msg.charAt(i);
            temp = temp*key;
            cipher = cipher + (char)temp;
        }
        System.out.println("Cipher text: "+cipher);
        String plain = "";
        for(int i=0;i<cipher.length();i++)
        {
            int temp = cipher.charAt(i);
            temp = temp/key;
            plain = plain + (char)temp;
        }
        System.out.println("Plain text: "+plain);
    }
}

