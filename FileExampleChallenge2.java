import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileExampleChallenge2
{
    public static void main(String[] args)
    {
        try(FileInputStream fis1 = new FileInputStream("I:/text.txt");FileInputStream fis2 = new FileInputStream("I:/copy.txt");FileOutputStream fos = new FileOutputStream("I:/Destination.txt");SequenceInputStream sis = new SequenceInputStream(fis1,fis2);)
        {
            byte[] b = new byte[sis.available()];
            sis.read(b);
            String str = new String(b);
                fos.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
