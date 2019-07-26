package www.fanfan.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //1. 向队列中添加元素
        queue.add("a");
        queue.add("b");
        queue.add("c");
        //2. 返回队列中的第一个元素但不移除
        System.out.println("当前队列的第一个元素："+queue.peek());
        //3. 返回队列中的第一个元素并移除
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

