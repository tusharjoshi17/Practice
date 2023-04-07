import java.io.*;
import java.util.Scanner;

class Customer4 implements Serializable
{
    String custID;
    String name;
    String phoneNo;

    static int count=1;
    Customer4(){}
    Customer4(String name,String phoneNo)
    {
        this.custID="C"+count;
        count++;
        this.name=name;
        this.phoneNo=phoneNo;
    }
    public String toString(){
        return"\nCustomer Details\n" +
                "\nID:C"+custID+
                "\nName "+name+
                "\nPhone no: "+phoneNo+"\n";
}

public static class SerializationChallenge {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("I:/Serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Customer4[] list ={new Customer4("Tushar Joshi","9881544790"),new Customer4("Nikku Joshi","7020982410"),new Customer4("Lionel Messi","9483957394")};
        oos.writeInt(list.length);
        for(Customer4 C:list)
        {
            oos.writeObject(C);
        }
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("I:/Serialization.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Scanner sc = new Scanner(System.in);
        int length=ois.readInt();
        Customer4[]arr=new Customer4[length];
        for(int i =0;i<length;i++)
        {
            arr[i]=(Customer4)ois.readObject();
        }
        System.out.println("Enter Customer Name: ");
        String name =sc.nextLine();
        for(int i = 0;i<length;i++)
        {
            if(name.equalsIgnoreCase(arr[i].name));
            System.out.println(arr[i]);
        }
        ois.close();
        fis.close();
    }
}
}
