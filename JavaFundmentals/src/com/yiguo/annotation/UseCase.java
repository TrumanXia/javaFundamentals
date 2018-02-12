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
 * ʵ�����ע��
 * 
 * @author YURI
 * @Retention����ָ���˸�Annotation��������ʱ�䳤�̡�RetentionPolicyȡֵΪSOURCE,CLASS,RUNTIME��
 * 
 * Retention(����)ע��˵��,�������͵�ע��ᱻ�������Ǹ��׶�. ������ֵ:
1.RetentionPolicy.SOURCE ���� �������͵�Annotationsֻ��Դ���뼶����,����ʱ�ͻᱻ����
2.RetentionPolicy.CLASS ���� �������͵�Annotations����ʱ������,��class�ļ��д���,��JVM�������
3.RetentionPolicy.RUNTIME ���� �������͵�Annotations����JVM����,����������������ʱ��JVM������ʹ�÷�����ƵĴ�������ȡ��ʹ��.

 * @Target ��ʾ��ע������ʲô�ط������ܵ�ֵ��ö���� ElemenetType �У�������
 *         ElemenetType.CONSTRUCTOR----------------------------����������
 *         ElemenetType.FIELD --------------------------------------������������ enum
 *         ʵ���� ElemenetType.LOCAL_VARIABLE------------------------- �ֲ���������
 *         ElemenetType.METHOD ----------------------------------��������
 *         ElemenetType.PACKAGE --------------------------------- ������
 *         ElemenetType.PARAMETER ------------------------------��������
 *         ElemenetType.TYPE---------------------------------------
 *         �࣬�ӿڣ�����ע�����ͣ���enum����
 * 
 * @Documented ���� ָ��ӵ�����ע���Ԫ�ؿ��Ա�javadoc����Ĺ����ĵ�������������Ӧ������ע����ЩӰ��ͻ�ʹ�ô�ע�͵�Ԫ������������
 *             �����һ������ʹ��Documented����ע�⣬�������͵�ע�ⱻ��Ϊ����ע�ĳ����Ա�Ĺ���API��
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
