package xyg.study.forInterview;

class StringEqualTest
{
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2); // false
        // �������ַ����������ĳ������������
        System.out.println(s1 == s5); // false wrong answer reference down below
        System.out.println(s1 == s6); // false
        System.out.println(s1 == s6.intern()); //
        System.out.println(s2 == s2.intern());
        /*
         * false
         * true
         * false
         * true
         * false
         */
        /*
         * String str1 = ��ABC��;���ܴ���һ�����߲���������
         * �����ABC������ַ�����java String���ﲻ���ڣ�����java String���ﴴ��һ������һ��String����(��ABC��)��
         * Ȼ��str1ָ������ڴ��ַ�������Ժ������ַ�ʽ�������ٸ�ֵΪ��ABC�����ַ�������
         * ʼ��ֻ��һ���ڴ��ַ�����䣬֮��Ķ���String�Ŀ�����Java�г�Ϊ���ַ���פ������
         * ���е��ַ������������ڱ���֮���Զ���פ����
         * String str2 = new String(��ABC��);���ٴ���һ������Ҳ����������
         * ��Ϊ�õ�new�ؼ��֣��϶�����heap�д���һ��str2��String��������value�ǡ�ABC����
         * ͬʱ�������ַ�����java String���ﲻ���ڣ�����java���ﴴ�����String����ABC��
         */
        /*
         * a��b�ڱ���ʱ���Ѿ���ȷ���ˣ���c�����ñ����������ڱ���ʱ�ͱ�ȷ����
         * 
         * Ӧ�õ������������ƽʱ��ʹ���У�����ʹ��String = ��abcd��;���ַ�ʽ�������ַ�����������String = new
         * String(��abcd��);������ʽ����Ϊʹ��new�����������ַ�������һ���Ὺ��һ���µ�heap�ռ䣬��˫�������ǲ�����String
         * interning(�ַ���פ��)�������Ż���Ч�ʱȹ������ߡ�
         */
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1 == str2); // false

        String str3 = "ABC";
        String str4 = "ABC";
        String str5 = "AB" + "C";
        System.out.println(str3 == str4); // true
        System.out.println(str3 == str5); // true

        String a = "ABC";
        String b = "AB";
        String c = b + "C";
        System.out.println(a == c);// false
    }
}
