public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("[1].数学计算开始前");
        try {
            System.out.println("[2].进行数学计算："+10/0);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("[Finally]不管是否产生异常，都执行此语句");
        }
        System.out.println("[3].数学计算结束后"); }
}

