import java.util.Scanner;

class Student1{
    int roll;
    String name;
    String subject;
    int m1,m2,m3;

    int total(){
        return m1+m2+m3;
    }
    int average(){
        return total()/3;
    }
    char grade(){
        if(average()>=60){
            return 'A';
        }
        else if(average()>=50){
            return 'B';
        }
        else if(average()>=40){
            return 'C';
        }
        else{
            return 'D';
        }
    }

}
public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        System.out.print("Enter the roll number of the student: ");
        Scanner r = new Scanner(System.in);
        s1.roll = r.nextInt();
        System.out.print("Enter the name of the student: ");
        Scanner n = new Scanner(System.in);
        s1.name = n.nextLine();
        System.out.print("Enter the subject of the student: ");
        Scanner sub = new Scanner(System.in);
        s1.subject = sub.nextLine();
        s2.subject = sub.nextLine();
        s3.subject = sub.nextLine();
        System.out.print("Enter the marks of the student in three subjects: "+s1.subject+" "+s2.subject+" "+s3.subject);
        Scanner m = new Scanner(System.in);
        s1.m1 = m.nextInt();
        s2.m2 = m.nextInt();
        s3.m3 = m.nextInt();
        System.out.println("\nRoll number: "+s1.roll);
        System.out.println("Name: "+s1.name);
        System.out.println("Subject: "+s1.subject);
        System.out.println("Marks: "+s1.m1+" "+s2.m2+" "+s3.m3);
        System.out.println("Total: "+s1.total());
        System.out.println("Average: "+s1.average());
        System.out.println("Grade: "+s1.grade());
    }
}
