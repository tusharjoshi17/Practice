public class Regex {
    public static void main(String[] args) {
        String str="a";
        System.out.println(str.matches(".")); //"." is used for any single character

        String str1="a";
        System.out.println(str1.matches("[abc]")); //"[abc]" is used to match exactly letters

        String str2="av";
        System.out.println(str2.matches("[abc][vz]")); //"[abc][vz]" is used to match either one of the give letters

        String str3="e";
        System.out.println(str3.matches("[^abc]")); //except [abc]

        String str4="h2";
        System.out.println(str4.matches("[a-z][1-9]")); //[a-z][1-9] is used to match any single character from a to z and any single digit from 1 to 9

        String str5="A";
        System.out.println(str5.matches("A|B")); //A or B

        String str6="XZ";
        System.out.println(str6.matches("XZ")); //to check whether the string maybe either a single or
//        multiple alphabets

        String str7="5";
        System.out.println(str7.matches("\\d")); //it will be true if it is a digit among 0-9.

        String str8="t";
        System.out.println(str8.matches("\\D")); //it will be true if it is any symbol other than digits.

        String str9=" ";
        System.out.println(str9.matches("\\s")); //it will be true if it is a space.

        String str10="s";
        System.out.println(str10.matches("\\S")); //it will be true if it is any symbol other than space.

        String str11="1";
        System.out.println(str11.matches("\\w")); //it will be true if it is a word either digit or letter.

        String str12="@";
        System.out.println(str12.matches("\\W")); //it will be true if it is any symbol other than word.
    }
}