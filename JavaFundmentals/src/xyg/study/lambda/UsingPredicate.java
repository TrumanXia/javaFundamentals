package xyg.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * {@link Predicate} �Ѿ������˺���ʽ�ӿ�
 * [������ϸ����]
 * 
 * @author Truman_SSD
 * @version [�汾��, 2018��2��23��]
 */
public class UsingPredicate
{

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> results = new ArrayList<T>();
        for (T s : list) {
            if (predicate.test(s)) {
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "ss", "");
        // ���洫��Lambda���ʽ
        System.out.println(filter(list, (String s)->!s.isEmpty()));
    }
}
