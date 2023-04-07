import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FIleExample {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis = new FileInputStream("I:/text.txt"))
        {

            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);

//            String str ="No one can stop me";
////            fos.write(str.getBytes());
//            byte[] b = str.getBytes();
//            for(byte x: b)
//            {
//                fos.write(x);
            }
        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

