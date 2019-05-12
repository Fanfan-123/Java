public class Code_练习1 {
    //1.使用 for 循环
    public static void main(String[] args) {
        print1(1,100);
        System.out.println();
        print2(1,100);
        System.out.println();
        print3(1,100);
    }

    //1.使用 for 循环
    public static void print1(int begin,int end){
        for (int i = begin; i <= end; i++) {
            System.out.print(i + " ");
        }
    }

    //2.使用while 循环
    public static void print2(int begin,int end){
        int i = begin;
        while (i <= end){
            System.out.print(i+" ");
            i++;
        }
    }
    //3.使用 do...while 循环
    public static void print3(int begin,int end){
        int i = begin;
        do{
            System.out.print(i+" ");
            i++;
        }while (i <= 100);
    }
}
