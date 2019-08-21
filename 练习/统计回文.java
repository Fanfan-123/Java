package com.fanfan;

import java.util.Scanner;

public class 统计回文 {
    // 3.在此处判断是否是回文
    public static boolean isHuiWen(String s){
        StringBuffer sb = new StringBuffer();
        sb = sb.append(s);
        String str = sb.reverse().toString();
        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //1. 输入两个字符串A和B
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        //2. 将B插入A的不同位置形成一个新的字符串
        int count = 0;
        String sub1 = null;
        String sub2 = null;
        for (int i = 0;i <= A.length();i++){
            StringBuffer sb = new StringBuffer();
            if (i == 0){
                sb = sb.append(B).append(A);
            }else {
                sub1 = A.substring(0,i);
                sub2 = A.substring(i,A.length());
                sb = sb.append(sub1).append(B).append(sub2);
            }
            String str = sb.toString();
            if (isHuiWen(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
