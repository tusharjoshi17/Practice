package src;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        al1.add(55);
        al1.add(0, 10);
        al1.addAll(1,al2);
        System.out.println(al1);

        for(int i =0;i<al1.size();i++){
            System.out.println(al1.get(i));
        }
        for(var i:al1)
        {
            System.out.println(i);
        }
    }
}
