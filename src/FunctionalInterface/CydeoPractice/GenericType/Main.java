package FunctionalInterface.CydeoPractice.GenericType;

class Main {
    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // generics method working with String
        System.out.println(demo.genericsMethod("Java Programming"));

        // generics method working with integer
        System.out.println( demo.genericsMethod(25));

    }
}

class DemoClass<T> {

    // creae a generics method
    public <T> T genericsMethod(T data) {
        return data;
    }
}