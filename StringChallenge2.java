public class StringChallenge2 {
    public static void main(String[] args) {
    int b=10110001;
    String str= Integer.toString(b);
        System.out.println(str.matches("[0-9]{8}"));
        String a="B1249F";
        System.out.println(a.matches("[0-9A-F]+"));
        String date="01/06/2022";
        System.out.println(date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
    }
}
