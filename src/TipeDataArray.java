public class TipeDataArray {
    // notes :
    // 1. array in java is fixed length, we need specify in the first time
    // 2. default value null
    // 3. cannot delete data in array
    public static void main(String[] args) {
        String[] names;
        names = new String[3]; // array with length 3
        String[] names2 = new String[3];
        String[] names3 = {"abc", "cde" };
        String[] names4 = new String[]{ "abc" , "cde" };

        String[][] members = new String[3][3];
        String[][] members2 = {
                {"abc", "cde"},
                {"cde", "abc"}
        };

        String[][][] matrix = {
                {
                        {"abc" , "cde"}
                },
                {
                        { "def", "fgh"}
                }
        };

        // add
        System.out.println(names[0]); // null
        names[0] = "abc";
        names[1] = "cde";
        names[2] = "bca";

        // read
        String firstData = names[0];

        // for each
        for (var data : names) {
            // do something
        }


        names[3] = "bca"; // this is runtime error index out of bond

        // length
        int length = names.length;
    }
}
