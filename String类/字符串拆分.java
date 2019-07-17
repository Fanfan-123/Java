public class String类方法的使用 {
    public static void main(String[] args) {
        String str = "hello world hello China!";
        //5. 字符串拆分
        //5.1 将字符串按照特定字符全部拆分成子字符数组
        String[] ch1 = str.split(" ");
        System.out.println("按照“ ”拆分后的子字符串数组为：");
        for (String i:ch1){
            System.out.println(i);
        }
        //5.2 将字符串按照特定字符拆分成某长度的子字符数组
        String[] ch2 = str.split(" ",2);
        System.out.println("按照“ ”拆分后长度为2的子字符串数组为：");
        for (String i:ch2){
            System.out.println(i);
        }
     }
 }
