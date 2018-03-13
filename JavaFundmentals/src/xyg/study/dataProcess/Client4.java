package xyg.study.dataProcess;

import java.util.List;
//import static 
/**
 *  1. Using predicate do the filtering
 * 
 *  [功能详细描述]
 * @author Truman_SSD
 * @version [版本号, 2018年2月27日]
 */
public class Client4
{
    public static void main(String[] args) {
        List<Dish> dishs = new Menu().menuDetail;
        long numOfVegetaian = dishs.stream()
                .filter(Dish :: isVegetarian)       // 用谓词进行筛选
                .count();
        System.out.println(numOfVegetaian);
    }
}
