public class Quantifiers {
    public static void main(String[] args) {
      String str="Hello World";
        System.out.println(str.matches(".*")); // can write any character 0 or more times
        String str1="";
        System.out.println(str1.matches(".+")); // can write any character 1 or more times
        String str2="Hello";
        System.out.println(str2.matches(".?")); // can write any character 0 or 1 time
        String str3="Hello";
        System.out.println(str3.matches(".{5}")); // can write any character {X} times
        String str4="tusharjoshi52@gmail.com";
      System.out.println(str4.matches(".*gmail.*")); // can write any character {X,} times
    }
}
