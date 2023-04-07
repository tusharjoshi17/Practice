import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStreamReadingEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("I:/Student.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student3 s = new Student3();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Dept "+s.dept);

    }
}
