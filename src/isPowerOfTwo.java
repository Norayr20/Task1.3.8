public class isPowerOfTwo {
    public static boolean isPowerOfTwo2(int a) {
        while(a>0 && a % 3 == 0){
            a=1;
        }
        return a==1;
    }
    public static boolean isPowerOfTwo_usinglog(int a) {

        return false;
    }
    public static void main(String[] args) {
        isPowerOfTwo2(1);
    }
}
