package xyg.study.dataProcess;

import static java.util.stream.Collectors.toList;

import java.util.List;
/**
 *  ���Ե�������������ֵ���۲�Stream������ʵ��ԭ��
 *  �������������ֵ����3��Stream�ڲ����ƻ�һֱ����ȥ��
 * @author Truman_SSD
 * @version [�汾��, 2018��2��26��]
 */
public class Client2
{
    public static void main(String[] args) {
        List<Dish> dishs = new Menu().menuDetail;
        List<String> highCalories =
                dishs.stream()                                      // �õ�Stream��
                        .filter(d -> {
                            System.out.println("filtering " + d.getName());  
                           return d.getCalories() > 1000;
                        }) // ���ù�������
                        .map(d -> {
                            System.out.println("mapping " + d.getName());
                            return d.getName();
                        })                  // :: ��ʾ����ĳ������Ϊ����
                        .limit(3)                                       // ������ĿΪ3��
                        .collect(toList());                          // ��Streamת��ΪList ����Ϊ�м���� һ��Ϊ�ն˲���
        System.out.println(highCalories);
    }
}
