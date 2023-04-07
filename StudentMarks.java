import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        int m1,m2,m3;
        System.out.println("Enter Marks");
        Scanner sc=new Scanner(System.in);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
       int total=m1+m2+m3;
       float average=(float) total/3;
           if (average>=70)
           {
                System.out.println("A");
           }
           else if(average >=60 && average <70){
                System.out.println("B");
           }
           else if(average >=50 && average <60){
                System.out.println("C");
            }
           else{
                System.out.println("F");
            }

    }
}
