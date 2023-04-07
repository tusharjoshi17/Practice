@FunctionalInterface
interface MyLambda2
{
    public int add(int a,int b);
}

public class LambdaExpressions2
{
    public static void main(String[] args) {
        MyLambda2 m = (a,b)->a+b;
        int r=m.add(10,20);
        System.out.println(r);
    }
}
