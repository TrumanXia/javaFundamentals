package xyg.study.forInterview.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test02
{
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>(); // Java
                                                 // 7����ʯ�﷨(����������ļ������в���Ҫд����)
        list.add(new Student2("Hao LUO", 33));
        list.add(new Student2("XJ WANG", 32));
        list.add(new Student2("Bruce LEE", 60));
        list.add(new Student2("Bob YANG", 22)); // ͨ��sort�����ĵڶ�����������һ��Comparator�ӿڶ���
                                                // // �൱���Ǵ���һ���Ƚ϶����С���㷨��sort������
                                                // // ����Java��û�к���ָ�롢�º�����ί�������ĸ���
                                                // //
                                                // ���Ҫ��һ���㷨����һ��������Ψһ��ѡ�����ͨ���ӿڻص�
        Collections.sort(list, new Comparator<Student2>()
        {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getName().compareTo(o2.getName()); // �Ƚ�ѧ������
            }
        });
        for (Student2 stu : list) {
            System.out.println(stu);
        } // ������: // Student [name=Bob YANG, age=22]// Student [name=Bruce LEE,
          // age=60]// Student [name=Hao LUO, age=33]// Student [name=XJ WANG,
          // age=32]
    }
}
