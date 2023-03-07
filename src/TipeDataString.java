public class TipeDataString {
    // notes :
    // 1. using double quote -> ""
    // 2. default value is null

    public static void main(String[] args) {
        String name = "andre";
        String a; // null, we cannot using this variable for expression if variable not initialize
        //System.out.println(a); // throw error, variable not initialize

        // concat
        String concatString = "Hello" +  name;
    }
}
