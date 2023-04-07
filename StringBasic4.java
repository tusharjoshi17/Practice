import java.util.Locale;

public class StringBasic4 {
    public static void main(String[] args) {
        String str="Java";
        int l=str.length();
        String str1=str.toLowerCase();
        String str2=str.toUpperCase();
        String str3 = str.trim();
        String str4=str.substring(3);
        String str5=str.replace('a','k');
        System.out.println(str+" "+str1+" "+str2+" "+str3+" "+str4+" "+str5);
        System.out.println(str.length());
        System.out.println(l);

    }
}
