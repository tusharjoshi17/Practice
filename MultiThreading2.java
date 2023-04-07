public class MultiThreading2 extends Thread {
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Thread: "+Thread.currentThread().getName()+" "+i);
            i++;
        }
    }

    public static void main(String[] args) {
        MultiThreading2 t1 = new MultiThreading2();
        MultiThreading2 t2 = new MultiThreading2();
        t1.start();
        t2.start();
        int i = 0;
        while(true){
            System.out.println("Main Thread: "+i);
            i++;
        }
    }
}

