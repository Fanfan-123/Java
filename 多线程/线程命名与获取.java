package www.kelly.com;

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5;i++){
            System.out.println("当前线程："+Thread.currentThread().getName()+":"+i);
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        new Thread(myThread).start();//没有设置名字
        new Thread(myThread,"hello").start();//设置了线程名
    }
}
