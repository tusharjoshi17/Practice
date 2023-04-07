public class StringChallenge1 {
    public static void main(String[] args) {
    String str ="programmer@gmail.com";
    int i=str.indexOf("@");
    String username=str.substring(0,i);
    String domain=str.substring(i+1);
        System.out.println(str.substring(0,str.indexOf("@")));
        System.out.println(str.substring(str.indexOf("@")+1));
        System.out.println(str.matches(".*@gmail.*"));
        System.out.println("username: "+username);
        System.out.println("domain: "+domain);
        System.out.println(domain.startsWith("gmail"));
    }
}
