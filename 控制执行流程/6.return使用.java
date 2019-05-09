public class Code_练习6 {
    public static void main(String[] args) {
        System.out.println(test(10,5,4));
        System.out.println(test(5,4,10));
        System.out.println(test(5,5,6));
        System.out.println(test(10,5,7));
        System.out.println(test(5,5,5));
    }

    public static int test(int testval,int begin,int end){
        if(end >= begin){
            if (testval >= begin && testval<=end){
                return +1;
            }else if(testval < begin || testval > end){
                return -1;
            }
        }
        System.out.println(end+"不能小于"+begin);
        return 0;

    }
}
