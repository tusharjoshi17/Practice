import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExampleChallenge
{
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("I:/text.txt"))
        {
            byte[] b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            try(FileOutputStream fos = new FileOutputStream("I:/copy.txt"))
            {
                fos.write((str.toLowerCase()).getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
