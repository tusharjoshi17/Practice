@FunctionalInterface
interface MyLambda3
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda3 ml)
    {
        ml.display();
    }
}

class Demo3
{
    public void method()
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello");
        });
    }
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.method();
    }
}
