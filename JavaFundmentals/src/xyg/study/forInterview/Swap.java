package xyg.study.forInterview;

public class Swap
{
//    可以使用二元组
    private static void swap(int a,  int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int i1=1, i2 = 2;
//        java是值传递，而不是引用传递
        swap(i1, i2);
        System.out.println("i1 = "+ i1+ ", i2 = "+i2);
    }
}
