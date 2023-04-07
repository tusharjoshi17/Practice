class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        t1.start();
        t1.interrupt();
    }
}
