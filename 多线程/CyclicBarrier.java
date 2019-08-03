package juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

class CBtask implements Runnable{
    private CyclicBarrier cyclicBarrier;

    public CBtask(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在写入数据");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName()+"当前线程写入完毕，等待其他线程写入完毕。。。");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程均已写入完毕，恢复继续执行");
    }
}

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        CBtask cBtask = new CBtask(cyclicBarrier);
        for (int i = 0; i < 4 ;i++){
            new Thread(cBtask,"写线程"+(i+1)).start();
        }
    }
}
