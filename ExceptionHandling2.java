public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,0};
        try{
            int b = a[8]/a[5];
            System.out.println(b);
            System.out.println(a[6]);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound error");
        }
        System.out.println("Rest of the code");
    }
}
