package xyg.study.behaviorAsParameter;

import java.util.ArrayList;
import java.util.List;

public class AppleColorPicker
{

    
    
    public static void countRedApple (List<Apple> apples, IPredicate predicate){
         List<Apple> apple_ret = new ArrayList<Apple> ();
         int counter = 0;
         for (Apple apple : apples){
             if (predicate.test(apple)){
                 System.out.println(apple + ": " +apple.getColor());
             }
         }
    }
    
//    public static void countRedAppleLambda (List<Apple> apples, IPredicate predicate){
//        List<Apple> apple_ret = new ArrayList<Apple> ();
//        int counter = 0;
//        for (Apple apple : apples){
//            if (predicate.test(apple)){
//                System.out.println(apple + ": " +apple.getColor());
//            }
//        }
//    }
//    
   
}
