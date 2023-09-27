package FunctionalInterface.BuildInInterfaces.ConsumerInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerInterface {
//    public static void printThreeTimes_Anonymous(String str){
//        Consumer<String> consumer=new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                for (int i = 0; i < 3; i++) {
//                    System.out.println(s);
//                }
//            }
//        };consumer.accept(str);
//    }

 public static void printThreeTimes_Lambda(String s){
     Consumer<String> consumer=input-> {
         for (int i = 0; i < 3; i++) {
             System.out.println(input);
         }
     };
     consumer.accept(s);
 }


    public static void main(String[] args) {
//        printThreeTimes_Anonymous("Hello Consumer");
        printThreeTimes_Lambda("Hello Lambda");

        Consumer<Integer> printNum=input-> {
            for (int i = 0; i <= input; i++) {
                System.out.println(input-input+i);
            }
        };
        printNum.accept(10);
    }
}
