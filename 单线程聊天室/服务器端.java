package com.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SingleServer {
    public static void main(String[] args) {
        //1. 实例化ServerSocket对象
        try {
            ServerSocket serverSocket = new ServerSocket(6666);//0-65535
            System.out.println("服务器启动"+serverSocket.getInetAddress()+":"
                    +serverSocket.getLocalPort());
            while (true) {
                //2. 等待接收客户端连接
                //为什么要加final
                //accept 阻塞方法，直到客户端连接到服务器
                final Socket socket = serverSocket.accept();
                System.out.println("来自客户端" + socket.getRemoteSocketAddress()
                        + ":" + socket.getPort());
                //3. 数据传输
                //3.1 写数据
                OutputStream out = socket.getOutputStream();
                PrintStream printStream = new PrintStream(out);
                printStream.println("欢迎你");//按行发
                printStream.flush();
                //3.2 读数据
                InputStream in = socket.getInputStream();
                Scanner scanner = new Scanner(in);
                String msg = scanner.nextLine();
                System.out.println("来自客户端的数据：" + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
