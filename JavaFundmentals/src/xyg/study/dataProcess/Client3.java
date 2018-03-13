package xyg.study.dataProcess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 *  ɸѡ�����Ԫ��
 *  �ض���
 *  ����Ԫ��
 *  [������ϸ����]
 * @author Truman_SSD
 * @version [�汾��, 2018��2��27��]
 */
public class Client3
{
    public static void main(String[] args) {
/*        List<Dish> dishs = new Menu().menuDetail;
        dishs.stream().forEach(System.out :: println);*/
        /*List<Integer> numbers = Arrays.asList(2, 3, 4, 7, 8, 2);
        numbers.stream()
                    .filter(i -> i % 2 ==0)
                    .distinct()
                    .limit(2)
                    .skip(1)
                    .collect(Collectors.toList())
                    .forEach(System.out :: println);*/
//        ���·���������ȷ���ҳ�ÿ�����ʵĲ��ظ����ַ�
        /*List<String> words = Arrays.asList("hello", "world");
        words.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out :: println);*/
        List<String> words = Arrays.asList("hello", "world");
        words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays :: stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out :: println);
        
    }
}
