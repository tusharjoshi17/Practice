class MyThread extends Thread {
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread("MyThread");

        System.out.println("Thread Name: "+t.getName());
        System.out.println("Thread Priority: "+t.getPriority());
        System.out.println("Thread State: "+t.getState());
        System.out.println("Thread ID: "+t.getId());
        System.out.println("Thread Group: "+t.getThreadGroup());
        System.out.println("Thread Alive: "+t.isAlive());
        System.out.println("Thread Daemon: "+t.isDaemon());
        System.out.println("Thread Interrupted: "+t.isInterrupted());
    }
}
