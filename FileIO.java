import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
//        try {
//            FileReader fis = new FileReader("I:\\IO.txt");
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.print((char) i);
//            }
//            fis.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        try{
            FileInputStream fis= new FileInputStream("I:\\IO.txt");
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
