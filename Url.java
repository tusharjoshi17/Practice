import java.util.Scanner;

public class Url {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the url: ");
         String url=scan.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("Protocol:Hypertext Transfer Protocol " + protocol);
        }
        else if(protocol.equals("ftp")){
            System.out.println("Protocol:File Transfer Protocol " + protocol);
        }
        else if(protocol.equals("https")){
            System.out.println("Protocol:Hypertext Transfer Protocol Secure " + protocol);
        }
        else{
            System.out.println("Protocol:Unknown ");
        }
        String domain = url.substring(url.lastIndexOf("."));
        if (domain.equals(".com")){
            System.out.println("Domain:Commercial " + domain);
        }
        else if(domain.equals(".org")){
            System.out.println("Domain:Organization " + domain);
        }
        else if(domain.equals(".net")){
            System.out.println("Domain:Network " + domain);
        }
        else if(domain.equals(".edu")){
            System.out.println("Domain:Education " + domain);
        }
        else if(domain.equals(".gov")){
            System.out.println("Domain:Government " + domain);
        }
        else{
            System.out.println("Domain:Unknown ");
        }
    }
}
