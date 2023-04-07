import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Unique {

    public static void main(String[] args) {

        File f = new File("I:\\unique.txt");
        Random r = new Random();

        List<Integer> l = new ArrayList<Integer>();
        int a = r.nextInt(9999);

        while (a < 1000) {
            a = r.nextInt(9999);
        }

        try {
            if (f.createNewFile()) {
                System.out.println("file created ");
            } else {
                System.out.println("file already exist");
            }
            for (int i = a; i < (a + 100000); i++) {
                l.add(i);
            }
            Collections.shuffle(l);
            FileWriter fw = new FileWriter(f.getAbsolutePath());
            for (int i = 0; i < l.size(); i++) {
                fw.write(Integer.toString(l.get(i)) + "\n");
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
