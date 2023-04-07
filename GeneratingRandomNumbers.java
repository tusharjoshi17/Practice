import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneratingRandomNumbers {

    public static void main(String[] args) throws IOException {
        Random r=new Random();
        File obj = new File("I:\\Non_unique.txt");
        FileWriter fw;
        if(obj.createNewFile()) {
            fw= new FileWriter(obj.getAbsoluteFile());
            for(int i=0;i<100000;i++) {
                fw.write(Integer.toString(r.nextInt(100000))+"\n");
            }
            fw.close();
            System.out.println("data inserted");
        }else {
            fw= new FileWriter(obj.getAbsoluteFile());
            for(int i=0;i<100000;i++) {
                fw.write(Integer.toString(r.nextInt(100000))+"\n");
            }
            fw.close();
            System.out.println("data inserted");
        }

    }

}
