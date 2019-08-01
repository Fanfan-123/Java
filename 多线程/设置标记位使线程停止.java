package www.kelly;

class MyThread2 implements Runnable{

    private boolean flag = true;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override

    public void run() {
        int i = 0;
        while (flag){
            try {
                Thread.sleep(1000);
                System.out.println("第"+i+"次执行，线程名为："+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2,"子线程");
        thread.start();
        Thread.sleep(1000);
        myThread2.setFlag(false);
        System.out.println("代码结束");
    }

}
