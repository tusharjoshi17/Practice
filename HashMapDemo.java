package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
public class HashMapDemo
{
    public static void main(String[] args)
    {
        HashMap <Integer,String> hm = new HashMap<>(Map.of(1,"A",2,"B",3,"C",4,"D",5,"E"));
        hm.put(6,"F");
        System.out.println(hm);
    }
}
