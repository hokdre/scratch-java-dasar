public class KonversionTipeDataNumber {
    // 2 type :
    // 1. Widening Casting / kecil ke besar (otomatis) : byte -> short -> int -> long -> float -> double
    // 2. Narrowing Casting / besar ke kecil (manual) : double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {
        // widening
        // 1. primitive value
        byte firstByte = 123;
        int firstInt = firstByte;
        // 2. non primitive
        // non primitive has method
        Byte nonPrimitiveByte = 123;
        int primitiveInt = nonPrimitiveByte.intValue();

        // narrowing
        // 1. primitive value
        firstByte = (byte) firstInt; // when narrowing we maybe can lost some value (number overflow)

        // 2. non primitive value
        Integer nonPrimitiveInt = 123;
        byte primitiveByte = nonPrimitiveInt.byteValue();
    }
}
