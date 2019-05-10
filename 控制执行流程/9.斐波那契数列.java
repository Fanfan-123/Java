public class Code_练习9 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 1;i <= 5;i++){
            System.out.println(fib(i));
        }
    }
    public static int fib(int v) {
        if (v <= 2) {
            return 1;
        }
        return fib(v - 1) + fib(v - 2);
    }
}
