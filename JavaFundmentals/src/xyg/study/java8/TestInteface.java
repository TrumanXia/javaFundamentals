package xyg.study.java8;

public interface TestInteface
{
    public static void testMethod(){
        System.out.println("java8�У��ӿڿ��Զ��徲̬����");
    }
    
    public default void testMethod2(){
        System.out.println("java8�У��ӿڿ��Զ�����ͨ���������Ǳ������η�����Ҫdefault");
    }
    public static void main(String[] args) {
        testMethod();
        new InterfaceImpl().testMethod2();
    }
}
