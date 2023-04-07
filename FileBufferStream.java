import java.io.*;

public class FileBufferStream {
    public static void main(String[] args) {
       try(FileReader fis = new FileReader("I:/copy.txt"); BufferedReader bis = new BufferedReader(fis))
       {
           System.out.println((char)bis.read());
           bis.mark(1);
           System.out.println((char)bis.read());
           bis.reset();
           System.out.println((char)bis.read());
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
