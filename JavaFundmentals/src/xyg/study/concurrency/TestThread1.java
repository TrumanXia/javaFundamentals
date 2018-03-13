package xyg.study.concurrency;

public class TestThread1
{

    public static void main(String[] args) {

        // 线程A
        final Thread a = new Thread(new Runnable()
        {

            @Override
            public void run() {
                System.out.println("A");

            }
        });

        // 线程B
        final Thread b = new Thread(new Runnable()
        {
            @Override
            public void run() {
                try {
                    // Waits for this thread to die. 
                    a.join();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B");

            }
        });

        // 线程C
        final Thread c = new Thread(new Runnable()
        {

            @Override
            public void run() {
                try {
                    // Waits for this thread to die.
                    b.join();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C");

            }
        });

        // 线程D
        Thread d = new Thread(new Runnable()
        {

            @Override
            public void run() {
                try {
                    // Waits for this thread to die.
                    c.join();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("D");
            }
        });

        // 启动四个线程，可以不按顺序启动线程，可以达到同样的效果
        a.start();
        c.start();
        d.start();
        b.start();
       

    }

}
