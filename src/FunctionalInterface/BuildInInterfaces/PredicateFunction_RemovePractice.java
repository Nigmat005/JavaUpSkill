package FunctionalInterface.BuildInInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunction_RemovePractice {
    public static boolean executeMethodRef(Integer input){
        return input<=70;
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,40,40,50,60,70,80));

//        Iterator<Integer> iterator=nums.iterator();
//
//        while(iterator.hasNext()){
//            Integer eachNums = iterator.next();
//            if(eachNums<40){
//                iterator.remove();
//            }
//        }
//        nums.forEach(System.out::println);

        Predicate<Integer> predicate=(input)->input<40;
        System.out.println("=====================================removeIf method============================");
//        nums.removeIf(predicate);
//        nums.removeIf(new Predicate<Integer>() {
//            public boolean test(Integer integer) {
//                return integer>=50;
//            }
//        });
        Predicate<Integer> methodRef=PredicateFunction_RemovePractice::executeMethodRef;
        nums.removeIf(methodRef);
        nums.forEach(System.out::println);
    }
}
