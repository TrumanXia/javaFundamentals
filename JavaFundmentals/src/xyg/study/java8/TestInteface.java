package xyg.study.java8;

public interface TestInteface
{
    public static void testMethod(){
        System.out.println("java8中，接口可以定义静态方法");
    }
    
    public default void testMethod2(){
        System.out.println("java8中，接口可以定义普通方法，但是必须修饰符必须要default");
    }
    public static void main(String[] args) {
        testMethod();
        new InterfaceImpl().testMethod2();
    }
}
