package xyg.study.forInterview.container;

import java.util.ArrayList;
import java.util.List;

public class DelElementDuringForEachCirculation
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");

        for (String temp : list) {
            if ("2".equals(temp)) {
                list.remove(temp);
            }
        }
        System.out.println(list);
    }
}
