package FunctionalInterface.BuildInInterfaces.FunctionINterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer,Integer> addNum=(int1)-> {
            return int1+10;
        };
        System.out.println(addNum.apply(1000));

        BiFunction<Integer,Integer,Integer> biFunction=(num1,num2)->num1+num2;

        System.out.println(biFunction.apply(10, 90));
    }
}
