//写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数
    //素数：只能被1和自身整出，而不能被其他数整除的数
public class Code_练习4 {
    public static void main(String[] args) {
        for (int i = 1;i <= 100;i++){
            int f = 0;
            for (int j = 1;j < (i+2)/2;j++){
                if((i%j) == 0){
                    f++;
                }
            }
            if(f < 2){
                System.out.println(i+"是素数");
            }
        }
    }
}
