package xyg.study.forInterview.jvmRelated;

/**
 * 
 * 通过数组定义来引用类，不会触发此类的初始化
 * @author Truman_SSD
 * @version [版本号, 2018年3月7日]
 */
public class TestClassDemo03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SuperClass_1 superClass[]=new SuperClass_1[5];
    }
}
class SuperClass_1{
    static{
        System.out.println("SuperClass init");
    }
}