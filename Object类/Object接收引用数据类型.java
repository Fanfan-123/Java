package www.fanfan.com;
interface IMessage{
    void print();
}
class Message implements IMessage{
    public void print(){
        System.out.println("1");
    }
        }
public class Objecte_使用 {
    public static void main(String[] args) {
        char[] data = new char[]{'a','b','c'};
        //1.Object接收数组对象
        Object obj = data;
        System.out.println(data);
        System.out.println(obj);
        //2.Object接收接口
        IMessage msg = new Message();
        Object obj1 = msg;
        System.out.println(msg);
    }
}

