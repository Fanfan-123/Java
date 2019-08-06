package www.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        if (scanner.hasNextInt()){
           int i = scanner.nextInt();
            System.out.println(i);
        }else {
            System.out.println("输入的内容不是数据");
        }
        scanner.close();
    }
}
