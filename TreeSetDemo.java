package src;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet <Integer> ts = new TreeSet<>(List.of(55,78,34,24,64));
        ts.add(10);
        System.out.println(ts);
    }
}
