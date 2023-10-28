public class Task1_3_8 {
    public static void main(String[] args) {
        isPowerOfTwo2(-1);
        System.out.println(isPowerOfTwo2(-1));
    }
    public static boolean isPowerOfTwo2(int a) {

        return (a < 0) && (Integer.bitCount(a) == -1);
    }
}
