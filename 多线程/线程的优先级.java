package www.waitandnotify;

class MyThread implements Runnable{
    private boolean flag;
    private Object object;

    public MyThread(boolean flag, Object object) {
        super();
        this.flag = flag;
        this.object = object;
    }

    public void waitMethod(){
        synchronized (object){
            while (true){
                System.out.println("wait（）方法开始"+Thread.currentThread().getName());
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait()方法结束"+Thread.currentThread().getName());
                return;
            }
        }
    }
    public void notifyMethod(){
        synchronized (object){
            System.out.println("notify（）方法开始"+Thread.currentThread().getName());
            object.notify();
            System.out.println("notify()方法结束"+Thread.currentThread().getName());
        }
    }
    @Override
    public void run() {
        if (flag){
            this.waitMethod();
        }else {
            this.notifyMethod();
        }
    }
}

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread myThread1 = new MyThread(true,object);
        MyThread myThread2 = new MyThread(false,object);
        Thread t1 = new Thread(myThread1,"wait线程");
        Thread t2 = new Thread(myThread2,"notiyf线程");

        t1.start();
        Thread.sleep(1000);
        t2.start();
        System.out.println("main方法结束");

    }
}
