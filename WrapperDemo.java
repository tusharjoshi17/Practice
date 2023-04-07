public class WrapperDemo {
    public static void main(String[] args) {
        int m1 = 2;
        Integer m2=Integer.valueOf(2);
        System.out.println(m2.equals(m1));

        float a = 10.4f/0;
        System.out.println(a==Float.POSITIVE_INFINITY);
    }
}
