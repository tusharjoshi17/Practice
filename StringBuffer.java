public class StringBuffer {
    public StringBuffer(String hello_) {
    }

    public static void main(String[] args) {
        String a = new String("Hello ");
        StringBuffer a2 = new StringBuffer("Hello ");
        StringBuilder a3 = new StringBuilder("Hello ");

        
        a.concat("World");
        a2.append("World");
        a3.append("World");
        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);
    }

    private void append(String world) {
    }
}
