package xyg.study.forInterview.jvmRelated;

/*
 * 通过子类引用父类的静态字段，不会导致子类初始化
 * */
public class TestClassDemo01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(SubClass.i);//子类引用父类的静态字段
    }
}
class SuperClass{
    public static int i=3;//父类的static字段
    static{//当此类在虚拟机中初始化的时候，此static块将会被执行
        System.out.println("SuperClass  init");
    }
}
class SubClass extends SuperClass{
    static{//当此类在虚拟机中初始化的时候，此static块将会被执行
        System.out.println("SubClass init");
    }

}
