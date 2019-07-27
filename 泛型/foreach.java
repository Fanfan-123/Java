package www.fanfan.com;

public class TestArgs {

    //计算任意个整数之和
    //使用可变参数和foreach
    public static int add(int...numbers){
        int sum = 0;
        for (int i:numbers){
        sum += i;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
    }
}
