package xyg.study.dataProcess;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Client1
{
    public static void main(String[] args) {

        List<Dish> dishs = new Menu().menuDetail;
//        List<String> highCalories =
           List<Integer> highCalories =
                dishs.stream()                                      // 得到Stream流
                        .filter(d -> d.getCalories() > 400) // 设置过滤条件
                        .map(Dish :: getName)                  // :: 表示传递某个方法为参数， 进行映射
                        .map(String :: length)
                        .limit(3)                                       // 限制数目为3条
                        .collect(toList());                          // 将Stream转换为List 以上为中间操作 一下为终端操作
        System.out.println(highCalories);
    }
}
