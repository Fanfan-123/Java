package com.kelly;

import java.util.Scanner;

public class Day_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c = in.next();
        for (int i = 1;i <= (n+1)/2;i++){
                if(i == 1 || i == (n+1)/2){
                    for (int k = 1;k <= n;k++){
                        System.out.print(c);
                    }
                    System.out.println();
                }else{
                    for (int m = 1;m <= n;m++ ){
                        if (m == 1 || m == n){
                            System.out.print(c);
                        }else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

        }
    }
}
