package FunctionalInterface.CydeoPractice;

public class methodReference {
    public  String execute(String s1,String s2){
        if(s1.compareTo(s2)>0)
            return s1;
        else
            return s2;
    }

    public static void main(String[] args) {
        methodReference obj=new methodReference();
        StringFunctions stringFunctions=obj::execute;
        System.out.println(stringFunctions.function("java", "C#"));
    }
}
