package xyg.study.forInterview;

class AutoUnboxingTest
{
    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3; // ��3�Զ�װ���Integer����
        int c = 3;
        // ��Ҫ��VM �����п������Բ��У�VM arguments ���ò��� -ea
        // assert 3 < 2;
        // System.out.println("hell");
        System.out.println(a == b); // false ��������û������ͬһ����
        System.out.println(a == c); // true a�Զ������int�����ٺ�c�Ƚ� } }12345678910
    }
}
