package www.kelly.com;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("主线程睡眠前的时间：");
        JoinTest.printTime();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("主线程睡眠后的时间");
        JoinTest.printTime();
    }
}

public class JoinTest {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1,"子线程A");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("代码结束");
    }
    public static void printTime() {
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        System.out.println(time);
    }
}
