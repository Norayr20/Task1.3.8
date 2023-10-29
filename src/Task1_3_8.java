public class Task1_3_8 {
    public static void main(String[] args) {

        boolean result = isPowerOfTwo2(1);
        System.out.println(result);
    }
    public static boolean isPowerOfTwo2(int a) {

        boolean b = (a < 0) && (Integer.bitCount(a) == 1);
        return true;
    }
}
