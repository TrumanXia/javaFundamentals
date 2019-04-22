package xyg.study.forInterview.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DelElementDuringForEachCirculation
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");

        // for (String temp : list) {
        // if ("2".equals(temp)) {
        // list.remove(temp);
        // }
        // }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            // String a = iterator.next();
            // if ("1".equals(a) || "2".equals(a)){
            // iterator.remove();
            // }
//            下面条件换行写，是为了方便debug
//            if ("2".equals(iterator.next()) 
//                    || "1".equals(iterator.next())) {
//                iterator.remove();
//            }
             if ("1".equals(iterator.next()) 
                     || "2".equals(iterator.next())){
             iterator.remove();
             }
        }
        System.out.println(list);
    }
}
