public class String类方法的使用 {
    public static void main(String[] args) {
        String str = "hello world hello China!";
        //6. 字符串截取
        //6.1 从指定位置截取到末尾
        String str1 = str.substring(2);
        System.out.println("从下标为2的位置开始截取到末尾的字符串为："+str1);
        //6.2 从指定位置截取一定长度的字符
        String str2 = str.substring(2,5);
        System.out.println("从下标为2的位置开始截取到下表为5（不包含5）的字符串："+str2);
        }
   }
