package xyg.study.dataProcess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 *  筛选各异的元素
 *  截断流
 *  跳过元素
 *  [功能详细描述]
 * @author Truman_SSD
 * @version [版本号, 2018年2月27日]
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
//        以下方法并不正确的找出每个单词的不重复的字符
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
