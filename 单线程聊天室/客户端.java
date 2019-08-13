package com.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SingleClient {
    public static void main(String[] args) {
        //1.客户端与服务器建立连接
        String host = "127.0.0.1";
        int port = 6666;
        try {
            Socket socket = new Socket(host,port);
            //2. 数据传输
            //2.1 读数据
            InputStream in = socket.getInputStream();
            Scanner scanner = new Scanner(in);
            String msg = scanner.nextLine();
            System.out.println("来自服务器的数据："+msg);
            //看两个客户端是否同时执行
            Thread.sleep(10000);
            //2.2 写数据
            OutputStream out = socket.getOutputStream();
            PrintStream printStream = new PrintStream(out);
            printStream.println("我来了");
            printStream.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
