class Sync{
    public void test(){
        synchronized (Sync.class){
            System.out.println("test方法开始，当前线程为 "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test方法结束，当前线程为 "+Thread.currentThread().getName());
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread,"黄牛A");
        Thread t2 =new Thread(myThread,"黄牛B");
        Thread t3 =new Thread(myThread,"黄牛C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
