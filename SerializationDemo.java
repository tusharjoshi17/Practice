import java.io.*;

class StudentSerial implements Serializable
{
    private int rollno;
    private String name;
    private String dept;
    private float avg;

    StudentSerial(){}
    StudentSerial(int r, String n, float a, String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
    }
    public String toString(){
        return"\nStudent Details\n" +
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+"\n";
    }
}

public class SerializationDemo {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("I:/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
//        StudentSerial s = new StudentSerial(10,"Tushar Joshi", (float) 8.55,"CSE");
//        oos.writeObject(s);
       StudentSerial s = (StudentSerial) ois.readObject();
        System.out.println(s);
        fis.close();
        ois.close();
    }
}
