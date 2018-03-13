package xyg.study.forInterview;

class AutoUnboxingTest
{
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3; // 将3自动装箱成Integer类型
        int c = 3;
        // 需要在VM 参数中开启断言才行，VM arguments 配置参数 -ea
        // assert 3 < 2;
        // System.out.println("hell");
        System.out.println(a == b); // false 两个引用没有引用同一对象
        System.out.println(a == c); // true a自动拆箱成int类型再和c比较 } }12345678910
    }
}
