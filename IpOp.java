import java.io.FileOutputStream;
import java.io.IOException;

public class IpOp {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("I:\\IO.txt");
            String str = "Hello World";
            byte b[]=str.getBytes();
//            fos.write(str.getBytes());
//            for(byte x:b)
//            fos.write(x);
            fos.write(b,6,str.length()-6);

            fos.close();
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
