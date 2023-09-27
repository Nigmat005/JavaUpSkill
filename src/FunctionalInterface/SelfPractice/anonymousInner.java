package FunctionalInterface.SelfPractice;

public class anonymousInner {

    public static void main(String[] args) {
        StringFunction implement=new StringFunction() {
            String result="";
            @Override
            public String Greet(String... var) {
                for(String info:var){
                    result+=" "+info;
                }
                return "Hello"+result;
            }
        };
        String[] test=new String[]{"Java", "how are you","Let's learn Lambda"};
        System.out.println(implement.Greet(test));
    }

}
