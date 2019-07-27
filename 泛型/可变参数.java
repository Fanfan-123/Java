package www.fanfan.com;

public class TestArgs {

    //计算任意个整数之和
    //使用可变参数
    public static int add(int...numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length;i++){
            sum = sum+numbers[i];
        }
        return sum;
    }
    //当有多个类型的参数的时候，可变参数要放在参数列表的最后
    public static int add(String message,int...numbers){
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,5));
        //可变参数不传值时，包装了一个空数组，不会出现空指针异常
        System.out.println(add());
    }
}

