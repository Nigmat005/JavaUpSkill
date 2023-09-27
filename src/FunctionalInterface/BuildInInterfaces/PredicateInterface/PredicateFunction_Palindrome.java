package FunctionalInterface.BuildInInterfaces.PredicateInterface;

import java.util.function.Predicate;

public class PredicateFunction_Palindrome {

    // Method for testing if a String is palindrome
//    public static boolean ifPalindrome(String input){
//        StringBuilder result=new StringBuilder(input);
//        if(result.reverse().toString().equalsIgnoreCase(input))
//                return true;
//            return false;

//    }

        public static boolean ifPalindrome(String testString){

            Predicate<String> predicate=(input)->{
                String result="";
                for (int i = input.length()-1; i >=0 ; i--) {
                    result+=input.charAt(i);
                }
                if(result.equalsIgnoreCase(input))
                    return true;
                return false;
            };
            return predicate.test(testString);
    }


    public static void main(String[] args) {
       Predicate<String> isPalindrome=(str)->new StringBuilder(str).reverse().toString().trim().equalsIgnoreCase(str.trim());
        System.out.println(isPalindrome.test("civic"));
        System.out.println(isPalindrome.test(" radar"));
        System.out.println(isPalindrome.test("hello"));

        System.out.println("====================================== try with method===========================");
        System.out.println(ifPalindrome("deified"));
        System.out.println(ifPalindrome("racecar"));


    }
}
