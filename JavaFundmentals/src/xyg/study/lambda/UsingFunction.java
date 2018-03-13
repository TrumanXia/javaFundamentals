package xyg.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UsingFunction
{
    public static <T, R> List<R> map(List<T> list, Function<T, R> fun) {

        List<R> list_ret = new ArrayList<R>();
        for (T t : list) {
            list_ret.add(fun.apply(t));
        }
        return list_ret;
    }

    public static void main(String[] args) {
        List<Integer> list = map(Arrays.asList("ss", "2sdfa"), (String s) -> s.length());
        System.out.println(list);
    }
}
