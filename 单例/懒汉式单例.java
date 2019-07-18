/2. 懒汉式
class Singleton2{
    //2.1 只创建，但是不产生实例化对象，等到用的时候再给出实例化对象
    private static Singleton2 instance;
    //2.2 私有的构造方法
    private Singleton2(){}
    //2.3 在getInstance（）方法中进行对象实例化，即用到该方法的时候才会及你选哪个实例化
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton2 singleton = null;//声明对象
        singleton = singleton.getInstance();//获取实例化对象
    }
}

