package xyg.study.forInterview.jvmRelated;

/*
 * ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
 * */
public class TestClassDemo01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(SubClass.i);//�������ø���ľ�̬�ֶ�
    }
}
class SuperClass{
    public static int i=3;//�����static�ֶ�
    static{//��������������г�ʼ����ʱ�򣬴�static�齫�ᱻִ��
        System.out.println("SuperClass  init");
    }
}
class SubClass extends SuperClass{
    static{//��������������г�ʼ����ʱ�򣬴�static�齫�ᱻִ��
        System.out.println("SubClass init");
    }

}
