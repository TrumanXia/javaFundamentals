package xyg.study.forInterview.jvmRelated;

/*
 * ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
 * */
public class TestClassDemo02 {

    public static void main(String[] args) {
        //System.out.println(SubClass.i);
        //SuperClass s=new SuperClass();
        SubClass2 s=new SubClass2();

    }

}
class SuperClass2{
    public static int i=3;
    static{
        System.out.println("SuperClass  init");
    }
}
class SubClass2 extends SuperClass2{
    static{
        System.out.println("SubClass init");
    }

}
