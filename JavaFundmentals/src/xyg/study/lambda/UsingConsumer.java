package xyg.study.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingConsumer
{
    
    private static <T> void forEach(List<T> list, Consumer<T> c){
        for (T i: list){
            c.accept(i);
        }
    }
    
    public static void main(String[] args) {
        forEach(Arrays.asList("ss", "sws", "2"), (String s)->System.out.println(s));
    }
}
