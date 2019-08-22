package com.fanfan;

import java.util.Scanner;

public class 汽水瓶 {
    public static int drink(int n){
        int total = 0;
        while (n > 2){
            total = total+n/3;
            n = n/3 + n%3;
        }
        if (n == 2){
            total = total+1;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (scanner.hasNextInt()){
            n = scanner.nextInt();
            System.out.println(drink(n));
        }
    }
}
