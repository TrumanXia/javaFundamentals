package xyg.study.forInterview;

class Outer
{
    class Inner
    {
    }

    public static void foo() {
        // new Inner(); // ´íÎó
        new Outer().new Inner();
    }

    public void bar() {
        new Inner();
    }

    public static void main(String[] args) {
        // new Inner(); // ´íÎó
        new Outer().new Inner();
    }
}
