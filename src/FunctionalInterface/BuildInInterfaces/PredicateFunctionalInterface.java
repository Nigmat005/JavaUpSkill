package FunctionalInterface.BuildInInterfaces;

import java.util.*;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> test = input -> input % 2 == 0;
//        Predicate<Integer> test=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        };
        System.out.println(test.test(10));



        // check if Unique String

        List<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "C#", "C#"));
        Predicate<String> checkIfUnique = input -> Collections.frequency(list, input) == 1;
//        Predicate<String> checkIfUnique = (input)->{
//                if(Collections.frequency(list,input)==1)
//                    return true;
//            return false;
//        };

        for (String s : list) {
            if (checkIfUnique.test(s)) {
                System.out.println(s);
            }
        }

    }



}
