import java.util.Scanner;

//class NegativeAgeException extends Exception {
//    public NegativeAgeException(String s) {
//        super(s);
//    }
//}
class NegativeDimensionException extends Exception {
    public String toString(){
        return "NegativeDimensionException: Negative Dimension";
    }
}

public class ThrowThrows {
    int area(int l,int b) throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    public static void main(String[] args) {
        ThrowThrows obj = new ThrowThrows();
        try{
//            System.out.println(obj.area(10, -5));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
            int l = sc.nextInt();
            System.out.println("Enter breadth: ");
            int b = sc.nextInt();
            System.out.println(obj.area(l, b));
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
    }
}
