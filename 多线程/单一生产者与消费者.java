package www.waitandnotify;

class Goods{
    private String goods;
    private int count;

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + goods + '\'' +
                ", count=" + count +
                '}';
    }
    //生产方法
    public synchronized void set(String goods) throws InterruptedException {
        //当库存中还有商品时，不用再生产商品，等待消费者消费
        if (this.count > 0){
            System.out.println("还有库存，等待消费者。。");
            wait();
        }
        //当库存中没有商品时，开始生产商品， 生产完后告诉消费者可以消费
        this.goods = goods;
        this.count++;
        System.out.println(toString());
        notify();
    }
    //消费方法
    public synchronized void get() throws InterruptedException {
        //当库存中没有商品时，消费者开始等待，等待生产者生产商品
        if (count == 0){
            System.out.println("请稍等，正在生产中。。。");
            wait();
        }
        //当库存中有商品的时候，消费者直接消费，消费完之后告诉生产者可以生产
        this.count--;
        System.out.println(toString());
        notify();
    }
}

class Producter implements Runnable{
    private Goods goods;

    public Producter(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        try {
            this.goods.set("铅笔");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer implements Runnable{
    private Goods goods;

    public Customer(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        try {
            this.goods.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        Goods goods = new Goods();
        Thread product = new Thread(new Producter(goods),"生产者");
        Thread customer = new Thread(new Customer(goods),"消费者");
        customer.start();
        Thread.sleep(1000);
        product.start();
    }
}
