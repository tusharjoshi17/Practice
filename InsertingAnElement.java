import java.util.Scanner;

public class InsertingAnElement {
    public static void main(String[] args) {
        int [] A=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=6;
        int s=6;
        for(int i = 0; i<s;i++){
            System.out.print(A[i]+",");
            System.out.println("");
        }
        Scanner sc=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number you want to add");
        int n=sc.nextInt();
        System.out.println("At which index you want to add");
        int index=sc.nextInt();

        for(int i = s; i>index;i--){
            A[i]=A[i-1];
            A[index]=s;
        }
        for(int i = 0; i<s;i++){
            System.out.print(A[i]+",");
            System.out.println("");
        }
    }
}
