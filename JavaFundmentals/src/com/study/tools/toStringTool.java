package com.study.tools;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class toStringTool
{
//    TODO 空方法 如何规范？返回值怎么取值
    private toStringTool(){
        
    }
    
    public static <T> String toStrings(Class<T> cls, Object obj){
//        入参校验
        if (!cls.isInstance(obj)){
            return obj.getClass().toString() + " 和 " + cls.getName() +" 不是一个类型";
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
