package xyg.study.dataProcess;

import java.util.List;
//import static 
/**
 *  1. Using predicate do the filtering
 * 
 *  [������ϸ����]
 * @author Truman_SSD
 * @version [�汾��, 2018��2��27��]
 */
public class Client4
{
    public static void main(String[] args) {
        List<Dish> dishs = new Menu().menuDetail;
        long numOfVegetaian = dishs.stream()
                .filter(Dish :: isVegetarian)       // ��ν�ʽ���ɸѡ
                .count();
        System.out.println(numOfVegetaian);
    }
}
