package xyg.study.forInterview;

class A
{
    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A
{
    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

public class HelloC
{
    public static void main(String[] args) {
        A ab = new B();
        // 1ab1ab -> 1a2b2b
        ab = new B();
    }
}
