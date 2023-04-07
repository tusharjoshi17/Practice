import java.io.FileOutputStream;
import java.io.*;

class Student3
{
    int rollno;
    String name;
    String dept;
}
public class PrintStreamExample {

        public static void main(String[] args)throws Exception {
            FileOutputStream fos = new FileOutputStream("I:/Student.txt");
            PrintStream ps = new PrintStream(fos);

            Student3 s = new Student3();
            s.rollno=10;
            s.dept="CSE";
            s.name="Tushar Joshi";

            ps.println(s.rollno);
            ps.println(s.name);
            ps.println(s.dept);

            ps.close();
            fos.close();
        }
}
