package FunctionalInterface.CydeoPractice;

public class CustomFunctionalInterface {

    public static void executeLambda(String s1,String s2){
        StringFunctions lambda=(st1,st2)->{
            if(st1.length()>st2.length())
                return st1;
            else
                return st2;
        };
        System.out.println(lambda.function(s1, s2));
    }


    public static void main(String[] args) {
        executeLambda("Java","Python");
    }
}
