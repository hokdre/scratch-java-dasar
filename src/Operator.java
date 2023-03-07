public class Operator {
    public static void main(String[] args) {
        // matemati
        int a = 1;
        int b = 3;
        System.out.println(a/b); // result will be zero
        float unexpected = 1 / 3;
        System.out.println(unexpected); // result still will be zero
        float expected = (float) a / (float) b; // to get correct result you need to change initial value to float
        System.out.println(expected); // result still will be 0.33333334

        a = a + b;
        b = b - a;
        b = b * b;
        b = b / b;
        int c = b % a;
    }
}
