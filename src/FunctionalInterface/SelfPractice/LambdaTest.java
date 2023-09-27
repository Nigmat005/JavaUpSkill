package FunctionalInterface.SelfPractice;

public class LambdaTest {

   public static String [] test={"Sup","Java","This is implementation of Lambda expression"};

    public static void executeLambda(){
        StringFunction lamdaImplementation=(test)->{
            StringBuilder result=new StringBuilder("YoYoYo ");
            for (String info: test){
                result.append(info).append(" ");
            }
            return String.valueOf(result);
        };
        System.out.println(lamdaImplementation.Greet(test));
    }

    public static void main(String[] args) {
      executeLambda();
    }

}
