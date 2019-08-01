package www.fanfan.com;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread4 implements Callable{

    private int ticket = 10;
    @Override
    public String call() throws Exception {
        while (ticket > 0){
            System.out.println("剩余的票数："+ticket--);
        }
        return "对不起，没有多余的票了";
    }
}
public class MyThreadTest4 {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new MyThread4());
        new Thread(task).start();
        new Thread(task).start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
