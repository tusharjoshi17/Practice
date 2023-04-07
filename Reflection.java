import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class New
{
    public int a;
    private float b;
    protected String c;
    char d;
    New(){}

    New(String name,int my){}

    public void display(String s1,String s2){}

    public int show(int x, int y){return 0;}
}

public class Reflection
{
    public static void main(String[] args) {
    Class<New> c=New.class;

        Field []field=c.getDeclaredFields();
        for(Field f:field)
        {
            System.out.println(f);
        }
        Method []meth =c.getMethods();
        for(Method m:meth)
        {
            System.out.println(m);
        }
        Parameter[] param =meth[0].getParameters();

        for(Parameter p:param)
        {
            System.out.println(p);
        }
    }
}

