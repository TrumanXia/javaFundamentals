package xyg.study.forInterview;

import java.lang.reflect.Field;
import java.util.Properties;

public class Test03
{
    public static void main(String[] args) throws Exception {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        // �����������͵ı���֮��ıȽ������ã����Ǳ�����ֵ
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
//        Field field = sun.misc.VM.class.getDeclaredField("savedProps");
        
//        Properties pros = (Properties) field.getClass();
//        Properties pros = new Properties();
//        pros.setProperty("java.lang.Integer.IntegerCache.high", "324");
//        field.setAccessible(true);
//        field.set(new Properties(), pros);
        
//        System.out.println(field.getName());
//        Properties properties = new Properties();
//        properties.setProperty("", null);

