package xyg.study.behaviorAsParameter;

import java.applet.AppletStub;
import java.util.ArrayList;
import java.util.List;

public class Client
{
    private static List<Apple> apples = new ArrayList<Apple>();

    // ׼������
    static {
        Apple a1 = new Apple();
        a1.setColor("red");
        Apple a2 = new Apple();
        a2.setColor("red");
        Apple a3 = new Apple();
        a3.setColor("blue");
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
    }

    public static void main(String[] args) {
        // AppleColorPicker.countRedApple(apples, new ColorPredicate());
        // ֱ��ʹ�� Lambda ���ʽ , Lambda �������ڲ�������
        AppleColorPicker.countRedApple(apples, (Apple apple) -> "blue".equals(apple.getColor()));
    }
}
