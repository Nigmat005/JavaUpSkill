package FunctionalInterface.SelfPractice;

public class NoLambdaTest  implements StringFunction {
    @Override
    public String Greet(String... var) {
        StringBuilder result= new StringBuilder("Hello: ");
        for(String info: var){
           result.append(info).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        NoLambdaTest NoLambdaTest=new NoLambdaTest();
        System.out.println(NoLambdaTest.Greet(new String[]{"Java", "how are you"}));
    }
}
