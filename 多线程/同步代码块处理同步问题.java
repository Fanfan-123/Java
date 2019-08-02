class MyThread implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        synchronized (this){
            while (ticket > 0) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "还有" + ticket-- + "张票");
            }
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
