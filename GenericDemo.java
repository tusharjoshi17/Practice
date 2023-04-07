class Data<T>
{
    private T obj;

    public void setData(T obj)
    {
        this.obj = obj;
    }
    public T getData()
    {
        return obj;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());
        Data<String> d1 = new Data<>();
        d1.setData("Hello");
        System.out.println(d1.getData());
    }
}
