public class PercabanganCase {
    public static void main(String[] args) {
        String name = "A";

        switch (name){
            case "a","A":
                System.out.println("this is a");
                break;
            case "b":
            case "c":
                System.out.println("this is b or c");
                break;
            case "d":
                System.out.println("this is d");
                break;
            default:
                System.out.println("this is default");
        }

        // switch lamda just work in java 14+
        // no need break
        switch (name){
            case "a","A" -> System.out.println("this is a");
            case "b","c" -> System.out.println("this is b or c");
            case "d" ->  System.out.println("this is d");
            default -> System.out.println("this is default");
        }

        // with return value
        String result  =  switch (name){
            case "a","A" : yield "this is a";
            case "b","c" : yield "this is b or c";
            case "d" : yield "this is d";
            default : yield "this is default";
        };
    }
}
