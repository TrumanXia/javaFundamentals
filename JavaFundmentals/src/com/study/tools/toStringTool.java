package com.study.tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class toStringTool
{
//    TODO �շ��� ��ι淶������ֵ��ôȡֵ
    private toStringTool(){
        
    }
    
    public static <T> String toStrings(Class<T> cls, Object obj){
//        ���У��
        if (!cls.isInstance(obj)){
            return obj.getClass().toString() + " �� " + cls.getName() +" ����һ������";
        }
        StringBuilder string_ret = new StringBuilder();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            try {
                if ("get".equals(method.getName().substring(0, 3))){
                    string_ret.append((String)method.invoke(obj, null));
                }
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return string_ret.toString();
    }
}
