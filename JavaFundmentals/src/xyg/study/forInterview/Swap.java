package xyg.study.forInterview;

public class Swap
{
//    ����ʹ�ö�Ԫ��
    private static void swap(int a,  int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int i1=1, i2 = 2;
//        java��ֵ���ݣ����������ô���
        swap(i1, i2);
        System.out.println("i1 = "+ i1+ ", i2 = "+i2);
    }
}
