public class Method {

    public static void main(String[] args) {
        // non return value
        sayHello();

        // return value
        System.out.println(constructHello("Andre"));

        // take array as arguments
        String[] names = { "Andre", "Hok"};
        System.out.println(combineArray(names));

        // variadic same like array
        System.out.println(combineString("a","b"));
        System.out.println(combineString(names));

        // recursion
        // recursion is possible throw err to stackoverflow if stack too deep
        factorial(5);
        factorial(10000); // this is possible to run time error
    }

    // use static because we call from main function that static method
    static void sayHello() {
        System.out.println("hello");
    }

    // we just can return 1 value
    static String constructHello(String name) {
        return "Hello" + name;
    }

    // take array as method argument
    static String combineArray(String[] names) {
        String res = "";
        for(var name : names) {
            res = res + name;
        }

        return res;
    }

    // variadic arguments, you can just use it in last arguments
    static String combineString(String... names) {
        String res = "";
        for(var name : names) {
            res = res + name;
        }

        return res;
    }

    // overloading, you need different the paramter
    static int Overload(int a) {
        return a;
    }
    static int Overload(int a, int b) {
       return a + b;
    }
    static String Overload(int a, int b, int c) {
        return "";
    }

    // recursion
    static int factorial(int value) {
        if (value == 1) {
            return 1;
        }

        return value * factorial(value-1);
    }
}
