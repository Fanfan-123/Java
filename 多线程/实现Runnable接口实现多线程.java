package www.fanfan.com;

class MyThread1 implements Runnable{
    private String title;

    public MyThread1(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            System.out.println(this.title+":i="+i);
        }
    }
}
public class MyThread1Test {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("张三");
        MyThread1 myThread2 = new MyThread1("李四");
        new Thread(myThread1).start();
        new Thread(myThread2).start();
    }

}
