import java.util.Scanner;

public class Day20_1 {
    public static int getTotalCount(int monthCount){
        if(monthCount <= 2){
            return 1;
        }else {
            return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int count = getTotalCount(month);
        System.out.println(count);
    }
}
