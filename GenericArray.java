@SuppressWarnings("unchecked")

class MyArray <T>
{
    T[] arr = (T[]) new Object[10];
    int index=0;

    public void append(T data)
    {
        arr[index]=data;
        index++;
    }
    public void display()
    {
        for(int i=0;i<index;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class GenericArray
{
    static <E> void show(E[] list)
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
    MyArray<Integer> arr = new MyArray<>();
/*
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.display();
        MyArray<String> arr1 = new MyArray<>();
        arr1.append("Hello");
        arr1.append("World");
        arr1.display();
*/
        Integer[] list = {10,20,30,40,50};
        show(list);
        show("Hello World".split(" "));
        show(new String[]{"Java is fun","Java is cool"});
    }
}
