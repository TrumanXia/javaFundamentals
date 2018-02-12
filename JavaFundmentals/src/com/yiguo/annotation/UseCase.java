package com.yiguo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * 
 * 实体类的注解
 * 
 * @author YURI
 * @Retention——指明了该Annotation被保留的时间长短。RetentionPolicy取值为SOURCE,CLASS,RUNTIME。
 * 
 * Retention(保留)注解说明,这种类型的注解会被保留到那个阶段. 有三个值:
1.RetentionPolicy.SOURCE —— 这种类型的Annotations只在源代码级别保留,编译时就会被忽略
2.RetentionPolicy.CLASS —— 这种类型的Annotations编译时被保留,在class文件中存在,但JVM将会忽略
3.RetentionPolicy.RUNTIME —— 这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用.

 * @Target 表示该注解用于什么地方，可能的值在枚举类 ElemenetType 中，包括：
 *         ElemenetType.CONSTRUCTOR----------------------------构造器声明
 *         ElemenetType.FIELD --------------------------------------域声明（包括 enum
 *         实例） ElemenetType.LOCAL_VARIABLE------------------------- 局部变量声明
 *         ElemenetType.METHOD ----------------------------------方法声明
 *         ElemenetType.PACKAGE --------------------------------- 包声明
 *         ElemenetType.PARAMETER ------------------------------参数声明
 *         ElemenetType.TYPE---------------------------------------
 *         类，接口（包括注解类型）或enum声明
 * 
 * @Documented —— 指明拥有这个注解的元素可以被javadoc此类的工具文档化。这种类型应该用于注解那些影响客户使用带注释的元素声明的类型
 *             。如果一种声明使用Documented进行注解，这种类型的注解被作为被标注的程序成员的公共API。
 *
 */
 
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface UseCase
{

    public int id() default -1;
//    public int value(); 
    public String description() default "no description";
}
