public class TipeDataChar {
    // operations :
    // 1. concat : char is single caracter, if we want to concat multi char we need change the type to string

    public static void main(String[] args) {
        // primitive
        char a = 'a'; // char is using single qoute, double quote is for string
        char b = 'b';

        // non primitive
        Character c = 'c';
        a = c;

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        sb.append(c);
        String str = sb.toString(); //"cbc"
    }

}
