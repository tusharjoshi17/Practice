enum Dept
{
    CS("Abhijeet","Wing A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    final String head;
    final String location;
    private Dept(String head,String location)
    {
        this.head=head;
        this.location=location;
    }
    public String getHead()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class Enum
{
    public static void main(String[] args)
    {
        Dept d=Dept.CS;
        System.out.println(d.getHead()+" "+d.getLocation());
    }
}
