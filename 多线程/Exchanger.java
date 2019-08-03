package juc;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        Thread girlThread = new Thread(()-> {
            try {
                String girl = exchanger.exchange("我喜欢你。。。");
                System.out.println("女生说："+girl);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        girlThread.start();
        Thread boyThread = new Thread(()-> {
            System.out.println("女神缓缓步入眼帘。。");
            try {
                TimeUnit.SECONDS.sleep(1);
                String boy = exchanger.exchange("我喜欢你！");
                System.out.println("男生说："+boy);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        boyThread.start();
    }
}
