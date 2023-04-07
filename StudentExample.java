package src;

import java.util.*;
import java.util.Scanner;
class Student
{
    public int rollno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }

    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String details()
    {
        return "Roll no:"+rollno+"\n"+"Name"+name+"\n"+"Course"+course+"\n";
    }

}

public class StudentExample {
    public static void main(String[] args) {

        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the roll no");
            s.rollno = sc.nextInt();
            System.out.println("Enter the name");
            s.name = sc.next();
            System.out.println("Enter the course");
            s.course = sc.next();
            System.out.println("Enter the marks of 3 subjects");
            s.m1 = sc.nextInt();
            s.m2 = sc.nextInt();
            s.m3 = sc.nextInt();
            System.out.println(s.details());
            System.out.println("Total marks:"+s.total());
            System.out.println("Average marks:"+s.average());
            System.out.println("Grade:"+s.grade());
        }
//        System.out.println("Enter the roll no");
//        s.rollno = sc.nextInt();
//        System.out.println("Enter the name");
//        s.name = sc.next();
//        System.out.println("Enter the course");
//        s.course = sc.next();
//        System.out.println("Enter the marks of 3 subjects");
//        s.m1 = sc.nextInt();
//        s.m2 = sc.nextInt();
//        s.m3 = sc.nextInt();
//        System.out.println(s.details());
//        System.out.println("Total marks:"+s.total());
//        System.out.println("Average marks:"+s.average());
//        System.out.println("Grade:"+s.grade());
//        Student s = new Student();
//        s.rollno=1;
//        s.name="Raj";
//        s.course="Java";
//        s.m1=50;
//        s.m2=60;
//        s.m3=70;
//        System.out.println(s.details());
//        System.out.println("Total marks:"+s.total());
//        System.out.println("Average marks:"+s.average());
//        System.out.println("Grade:"+s.grade());

    }
}
