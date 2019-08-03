package juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

//运动员线程
class CDLTask implements Runnable{

    private CountDownLatch countDownLatch;

    public CDLTask(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始跑步");
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName()+"到达终点");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        CDLTask cdlTask = new CDLTask(countDownLatch);
        System.out.println("比赛开始");
        new Thread(cdlTask,"运动员A").start();
        new Thread(cdlTask,"运动员B").start();
        new Thread(cdlTask,"运动员C").start();
        new Thread(cdlTask,"运动员D").start();
        //等待所有线程都到达终点后再调用
        countDownLatch.await();
        System.out.println("比赛结束");
    }

}
