import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamChallenge  {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("I:/Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        float[] list ={10.5f,11.5f,56.7f,98.2f};
        dos.writeInt(list.length);
        for(float x:list)
        {
    dos.writeFloat(x);
        }
        dos.close();
        fos.close();

//        Reading part
        FileInputStream fis = new FileInputStream("I:/Data.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for(int i = 0;i<length;i++)
        {
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
