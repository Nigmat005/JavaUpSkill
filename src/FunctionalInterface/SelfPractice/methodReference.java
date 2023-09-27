package FunctionalInterface.SelfPractice;

public class methodReference {
    public static String [] test={"Sup","Java","This is implementation of MethodReference expression"};
    public static String methodReferenceImplementation(String ... var){
        StringBuilder result=new StringBuilder("This is method reference\n");
        for (String info:var){
            result=result.append(info).append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        methodReference object=new methodReference();
       // String[] testString=new String[]{"Sup","Java","This is implementation of Lambda expression"};
        StringFunction functionInInterface=methodReference::methodReferenceImplementation;
        System.out.println(functionInInterface.Greet(test));
    }
}
