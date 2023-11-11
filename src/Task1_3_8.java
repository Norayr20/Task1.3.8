public class Task1_3_8 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int a) {
        if (a == 0) {
            return false;
        }
        long absA = Math.abs((long) a);
        return (absA & (absA - 1)) == 0;
    }
}
