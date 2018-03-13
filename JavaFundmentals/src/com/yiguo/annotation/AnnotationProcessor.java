package com.yiguo.annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor
{

    public static void trackUseCases(Class<?> cls){
        
        for (Method method : cls.getDeclaredMethods()){
            
            UseCase useCase = method.getDeclaredAnnotation(UseCase.class);
            System.out.println(useCase.id()+": " + useCase.description());
        }
    }
}
