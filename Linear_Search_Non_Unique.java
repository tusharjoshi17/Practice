import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Linear_Search_Non_Unique {

    public static void main(String[] args) {

        File file = new File("D:\\Study\\JAVA\\DAA\\Non_unique.txt");
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the target number : ");
        int target=sc.nextInt();
        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                int element = Integer.parseInt(s.next());
                l.add(element);

            }
            System.out.println(l);
            int flag=0;
            for(int i=0;i<l.size();i++) {
                if(target==l.get(i)) {
                    System.out.println("Element found at Index "+ i);
                    flag=1;
                }
            }
            if(flag==0) {
                System.out.println("Element is not present in the File");
            }
            s.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
