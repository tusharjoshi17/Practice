import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReaderWithLinearSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long start2 = System.currentTimeMillis();
        int input = scanner.nextInt();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("I:\\Repeated_Sorted_Non_Unique.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedInputStream bis = new BufferedInputStream(fis);
        try {


            Set<Integer> numbers = new HashSet<>();
            int counter = 0;

            byte[] bytes = bis.readAllBytes();

            String numberString = new String(bytes, StandardCharsets.UTF_8);

            String[] numberSplit = numberString.split("\\r?\\n ");
            boolean flag = false;
            int count = 0;
            for(String s : numberSplit)
            {
                if(!" ".equals(s) && input == Integer.valueOf(s))
                {
                    flag = true;
                    count++;
                }
            }
            if(flag)
            {
                System.out.println("Number exists "+count+" times");
            }
            else
            {
                System.out.println("Number doesn't exist in file");
            }

        } catch (IOException ex) {
            ex.printStackTrace();

        }
        finally{
            try {
                fis.close();
                bis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            long end2 = System.currentTimeMillis();
            System.out.println("Time taken to read file: "+(end2-start2));
        }
    }

}
