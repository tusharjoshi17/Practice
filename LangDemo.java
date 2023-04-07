
class Demo
{
    public String toString()
    {
        return"Created String";
    }
    public int hashcode()
    {
        return 100;
    }
    public boolean equals(Demo d)
    {
    return this.hashcode()==d.hashcode();
    }
}

public class LangDemo
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        System.out.println(d1);
        System.out.println(d1.equals(d2));
    }
}
