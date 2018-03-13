package xyg.study.dataProcess;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Client1
{
    public static void main(String[] args) {

        List<Dish> dishs = new Menu().menuDetail;
//        List<String> highCalories =
           List<Integer> highCalories =
                dishs.stream()                                      // �õ�Stream��
                        .filter(d -> d.getCalories() > 400) // ���ù�������
                        .map(Dish :: getName)                  // :: ��ʾ����ĳ������Ϊ������ ����ӳ��
                        .map(String :: length)
                        .limit(3)                                       // ������ĿΪ3��
                        .collect(toList());                          // ��Streamת��ΪList ����Ϊ�м���� һ��Ϊ�ն˲���
        System.out.println(highCalories);
    }
}
