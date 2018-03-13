package xyg.study.forInterview.jvmRelated;

/**
 * 
 * 常量在编译阶段会存入调用它的类的常量池中，本质上没有直接引用到定义该常量的类，因此不会触发定义常量的类的初始化
 * 
 * @author Truman_SSD
 * @version [版本号, 2018年3月7日]
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
