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
        // 定义了字符串常量，改常量保存在哪里？
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
         * String str1 = “ABC”;可能创建一个或者不创建对象，
         * 如果”ABC”这个字符串在java String池里不存在，会在java String池里创建一个创建一个String对象(“ABC”)，
         * 然后str1指向这个内存地址，无论以后用这种方式创建多少个值为”ABC”的字符串对象，
         * 始终只有一个内存地址被分配，之后的都是String的拷贝，Java中称为“字符串驻留”，
         * 所有的字符串常量都会在编译之后自动地驻留。
         * String str2 = new String(“ABC”);至少创建一个对象，也可能两个。
         * 因为用到new关键字，肯定会在heap中创建一个str2的String对象，它的value是“ABC”。
         * 同时如果这个字符串再java String池里不存在，会在java池里创建这个String对象“ABC”
         */
        /*
         * a、b在编译时就已经被确定了，而c是引用变量，不会在编译时就被确定。
         * 
         * 应用的情况：建议在平时的使用中，尽量使用String = “abcd”;这种方式来创建字符串，而不是String = new
         * String(“abcd”);这种形式，因为使用new构造器创建字符串对象一定会开辟一个新的heap空间，而双引号则是采用了String
         * interning(字符串驻留)进行了优化，效率比构造器高。
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
