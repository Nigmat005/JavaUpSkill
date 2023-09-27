package FunctionalInterface.CydeoPractice.GenericType;

public class LambdaImplementation {
    public static void main(String[] args) {
        DataFunction<String> reverse=input->{
        return new StringBuilder(input).reverse().toString();
        };
        System.out.println(reverse.function("Java"));

        DataFunction<Integer> reverseInt=input->{
            return Integer.valueOf(new StringBuilder(String.valueOf(input)).reverse().toString());
        };
        System.out.println(reverseInt.function(51));
    }
}
