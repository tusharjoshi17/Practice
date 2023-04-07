package src;

import java.util.PriorityQueue;
import java.util.*;

class Mycom implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(new Mycom());
        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);
        p.add(5);
        p.forEach(System.out::println);
        System.out.println("After removing the head");
        p.remove();
        p.forEach(System.out::println);
    }
}
