package xyg.study.dataProcess;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 求平方数
 *  [功能详细描述]
 * @author Truman_SSD
 * @version [版本号, 2018年2月27日]
 */
public class Client5
{
    public static void main(String[] args) {
        List<Integer> originalNums = Arrays.asList(1, 3, 7, 4);
        originalNums.stream()
                            .map(n -> n*n)
                            .forEach(System.out :: println);
    }
}
