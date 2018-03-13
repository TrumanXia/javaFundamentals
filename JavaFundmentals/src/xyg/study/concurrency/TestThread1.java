package xyg.study.concurrency;

public class TestThread1
{

    public static void main(String[] args) {

        // �߳�A
        final Thread a = new Thread(new Runnable()
        {

            @Override
            public void run() {
                System.out.println("A");

            }
        });

        // �߳�B
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

        // �߳�C
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

        // �߳�D
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

        // �����ĸ��̣߳����Բ���˳�������̣߳����Դﵽͬ����Ч��
        a.start();
        c.start();
        d.start();
        b.start();
       

    }

}
