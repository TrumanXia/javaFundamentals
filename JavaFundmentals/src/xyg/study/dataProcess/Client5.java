package xyg.study.dataProcess;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * ��ƽ����
 *  [������ϸ����]
 * @author Truman_SSD
 * @version [�汾��, 2018��2��27��]
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
