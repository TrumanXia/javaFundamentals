package xyg.study.behaviorAsParameter;

public class CountThread implements Runnable
{

    @Override
    public void run() {
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        new CountThread().run();
    }

}
