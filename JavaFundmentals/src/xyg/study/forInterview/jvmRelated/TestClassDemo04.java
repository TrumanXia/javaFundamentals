package xyg.study.forInterview.jvmRelated;

/**
 * 
 * �����ڱ���׶λ�������������ĳ������У�������û��ֱ�����õ�����ó������࣬��˲��ᴥ�����峣������ĳ�ʼ��
 * 
 * @author Truman_SSD
 * @version [�汾��, 2018��3��7��]
 */
public class TestClassDemo04
{

    public static void main(String[] args) {
        System.out.println(ConstClass.VALUE);
    }

}

class ConstClass
{
    public static final int VALUE = 3;
    static {
        System.out.println("ConstClass init");
    }
}
