package www.waitandnotify;

import java.lang.reflect.Field;

class MyThread1 implements Runnable{
    private boolean flag;
    private Object object;

    public MyThread1(boolean flag, Object object) {
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
            object.notifyAll();
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

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        MyThread1 myThread1 = new MyThread1(true,object);
        MyThread1 myThread2 = new MyThread1(true,object);
        MyThread1 myThread3 = new MyThread1(true,object);
        MyThread1 myThread4 = new MyThread1(false,object);
        Thread t1 = new Thread(myThread1,"wait线程A");
        Thread t2 = new Thread(myThread2,"wait线程B");
        Thread t3 = new Thread(myThread3,"wait线程C");
        Thread t4 = new Thread(myThread4,"notifyAll线程");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);
        t4.start();
        System.out.println("main结束");


    }
}
