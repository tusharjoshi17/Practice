class ThreadTest3 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadTest3: " + i);
        }
    }
}

public class MultiThreading3 {
    public static void main(String[] args) {
        ThreadTest3 t1 = new ThreadTest3();
        ThreadTest3 t2 = new ThreadTest3();
        Thread t3 = new Thread(t1);
        Thread t4 = new Thread(t2);
        t3.start();
        t4.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

