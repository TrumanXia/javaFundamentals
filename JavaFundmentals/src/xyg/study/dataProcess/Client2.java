package xyg.study.dataProcess;

import static java.util.stream.Collectors.toList;

import java.util.List;
/**
 *  可以调整过滤条件的值，观察Stream操作的实现原理。
 *  如果满足条件的值不足3，Stream内部机制会一直找下去。
 * @author Truman_SSD
 * @version [版本号, 2018年2月26日]
 */
public class Client2
{
    public static void main(String[] args) {
        List<Dish> dishs = new Menu().menuDetail;
        List<String> highCalories =
                dishs.stream()                                      // 得到Stream流
                        .filter(d -> {
                            System.out.println("filtering " + d.getName());  
                           return d.getCalories() > 1000;
                        }) // 设置过滤条件
                        .map(d -> {
                            System.out.println("mapping " + d.getName());
                            return d.getName();
                        })                  // :: 表示传递某个方法为参数
                        .limit(3)                                       // 限制数目为3条
                        .collect(toList());                          // 将Stream转换为List 以上为中间操作 一下为终端操作
        System.out.println(highCalories);
    }
}
