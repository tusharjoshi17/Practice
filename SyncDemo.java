class SyncDemo1
{
    synchronized public void display(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
    class MyData extends Thread
    {
     SyncDemo1 sd;
     public MyData(SyncDemo1 sd)
     {
         this.sd = sd;
     }
        public void run()
        {
            sd.display("Hello World");
        }
    }
    class MyData2 extends Thread
    {
        SyncDemo1 sd;

        public MyData2(SyncDemo1 sd)
        {
            this.sd = sd;
        }

        public void run()
        {
            sd.display("Welcome");
        }
    }
    public class SyncDemo
    {
        public static void main(String[] args)
        {
            SyncDemo1 sd = new SyncDemo1();
            MyData md = new MyData(sd);
            MyData2 md2 = new MyData2(sd);
            md.start();
            md2.start();
        }
    }

