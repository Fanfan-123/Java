package www.waitandnotify;

import java.util.ArrayList;
import java.util.List;

class Goods1{
    private String goodsName;
    private Integer count;

    public synchronized void set(String goodsName) throws InterruptedException {
        while (count > 0){
            System.out.println("还有票，请消费。。");
            wait();
        }
        this.count = this.count+1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(toString());
        System.out.println("-------------------");
        notifyAll();
    }

    public synchronized void set() throws InterruptedException {
        while (count == 0){
            wait();
        }
        this.count = this.count-1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(toString());
        System.out.println("--------------------");
        notifyAll();
    }

    @Override
    public String toString() {
        return "Goods1{" +
                "goodsName='" + goodsName + '\'' +
                ", count=" + count +
                '}';
    }
}

class Producer1 implements Runnable{
    private Goods goods;

    public Producer1(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            try {
                this.goods.set("铅笔");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Custome1r implements Runnable{

    private Goods goods;

    public Custome1r(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            try {
                this.goods.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        Goods goods = new Goods();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0;i < 6;i++){
            Thread threadProduct = new Thread(new Producer1(goods),("生产者"+i));
            threads.add(threadProduct);
        }
        for (int i = 0;i < 3;i++){
            Thread threadCustomer = new Thread(new Custome1r(goods),("消费者")+i);
            threads.add(threadCustomer);
        }
        for (Thread thread:threads){
            thread.start();
        }
    }
}
