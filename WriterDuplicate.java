import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class WriterDuplicate {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("I:\\integer.txt");
             BufferedOutputStream oos = new BufferedOutputStream(fos)) {

            int counter = 0;

            Random random = new Random(0);
            while(counter < 100000)
            {
                if(counter != 0)
                {
                    oos.write(", ".getBytes(StandardCharsets.UTF_8));
                }
                Integer number = random.nextInt(300000);
                oos.write(number.toString().getBytes(StandardCharsets.UTF_8));
                counter++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

