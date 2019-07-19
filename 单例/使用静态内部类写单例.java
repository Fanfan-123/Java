/3. 静态内部类

class Singleton3{
    //3.1 构造方法私有化
    private Singleton3(){}
    //3.2 静态内部类中进行实例化
    public static class singletoInstance{
        public static Singleton3 instance = new Singleton3();
    }
    //3.3 使用getInstance（）方法获取实例化对象
    public static Singleton3 getInstance(){
        return singletoInstance.instance;
    }
    
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton3 singleton = null;//声明对象
        singleton = singleton.getInstance();//获取实例化对象
    }
}

