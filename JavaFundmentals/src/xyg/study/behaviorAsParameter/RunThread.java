package xyg.study.behaviorAsParameter;

public class RunThread
{
    private static Thread thread = new Thread(() -> System.out.println("1"));
    public static void main(String[] args) {
        thread.start();
    }
}
