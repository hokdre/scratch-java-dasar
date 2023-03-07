public class TipeDataNumber {

    // options :
    // 1. byte : -128 - 127 , size : 1byte
    // 2. short : -32768 - 32767 : 2byte
    // 3. int : -2147483648 - 2147483647 : 4byte
    // 4. long : -9223372036854775808 - 9223372036854775807 : 8byte

    // Note:
    // Compiler will be throw error if the value is out of range
    public static void main(String[] args) {
        byte firstByte = 1;
        byte secondByte = 1_00; // we can add underscore to more readable
       // byte errByte = 1000; // will be throw error in compile time
        short firstShort = 123;
        int firstInt = 32;
        long firstLong = 99L; // by default long is int, to tell compiler this is long we can place l or L in the last

        // primitive vs non primitive variable
        byte primitiveByte = 1;  // primitive not have method
        Byte nonPrimitiveByte = null; // non primitive have method and the default is null
        short primitiveShort = 1;
        Short nonPrimitiveShort = 1;
        int primitiveInt = 1;
        Integer nonPrimitiveInt = 1;
        long primitiveLong = 1;
        Long nonPrimitiveLong = 2L; // l or L is required

        // conversion beetween primitive vs non primitive
        // we can convert it directly
        nonPrimitiveByte = primitiveByte;
        primitiveByte = nonPrimitiveByte;


    }
}
