package www.fanfan.com;
//1. 饿汉式
class Singleton1{
    //1.1 产生私有的实例化对象
    private final static Singleton1 INSTANCE = new Singleton1();
    //1.2 构造方法私有化
    private Singleton1() { }
    //1.3 通过公开的静态getInstance（）方法获取私有属性
    public static Singleton1 getInstance(){
        return INSTANCE;
    }

}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton1 singleton = null;//声明对象
        singleton = singleton.getInstance();//获取实例化对象
    }
}

