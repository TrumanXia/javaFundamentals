package xyg.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * {@link Predicate} 已经定义了函数式接口
 * [功能详细描述]
 * 
 * @author Truman_SSD
 * @version [版本号, 2018年2月23日]
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
        // 下面传入Lambda表达式
        System.out.println(filter(list, (String s)->!s.isEmpty()));
    }
}
