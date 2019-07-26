package www.fanfan.com;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        //1. 压栈
        stack.push("hello");
        stack.push("world");
        stack.push("!!!");
        //2. 返回栈顶元素
        System.out.println("返回栈顶元素："+stack.peek());
        //3. 出栈
        //出栈之前判断栈是否为空，栈为空时出栈就会产生异常
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
    }
}

