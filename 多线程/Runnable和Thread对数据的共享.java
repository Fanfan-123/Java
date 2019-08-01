package www.fanfan.com;


//使用Thread实现数据共享
class MyThread2 extends Thread{
    private int ticket = 10;
    @Override
    public void run(){
        while (ticket > 0){
            System.out.println("剩余的票数："+ticket--);
        }
    }
}
//使用TRunnable实现数据共享
class MyThread3 extends Thread{
    private int ticket = 10;
    @Override
    public void run(){
        while(ticket > 0){
            System.out.println("剩余的票数："+ticket--);
        }
    }
}


public class MyThreadTest2 {
    public static void main(String[] args) {
        new MyThread2().start();
        new MyThread2().start();
        new MyThread2().start();


        MyThread3 myThread3 = new MyThread3();
        new Thread(myThread3).start();
        new Thread(myThread3).start();
    }
}
