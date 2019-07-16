public class String类方法的使用 {
    public static void main(String[] args) {
        String str1 = "jack";
        String str2 = "Jack";
        //2.1 区分大小写的比较
        System.out.println("区分大小写的结果为："+str1.equals(str2));
        System.out.println("----------------");
        //2.2 不区分大小写的比较
        System.out.println("不区分大小写的结果为"+str1.equalsIgnoreCase(str2));
        System.out.println("----------------");
        //2.3 比较两个字符串关系的大小
        System.out.println("两个字符串关系的大小为："+str1.compareTo(str2));
    }
}

