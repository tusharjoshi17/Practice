package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenizerDemo
{
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("I:\\Text files\\Token.txt");
      int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int j : a) {
            fos.write((j + " ").getBytes());
        }
        fos.close();
        FileInputStream fis = new FileInputStream("I:\\Text files\\Token.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        StringTokenizer st = new StringTokenizer(data," ");
        String s;
        ArrayList <Integer> al = new ArrayList<>();
        while(st.hasMoreTokens())
        {
            s=st.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);


    }
}
