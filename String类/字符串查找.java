public class String类方法的使用 {
    public static void main(String[] args) {
        String str = "hello world hello China";
        //3. 字符串查找
        //3.1  判断字符串是否存在
        System.out.println("判断指定字符串world是否在字符串str中存在："+str.contains("world"));
        System.out.println("----------------");
        //3.2 判断字符串是否以 指定字符开头
        System.out.println("判断字符串是否以 指定字符串hello开头："+str.startsWith("hello"));
        System.out.println("----------------");
        // 3.3 在指定位置判断字符串是不是以 给定字符串开头
        System.out.println("从下标为2的位置开始判断字符串是不是以 llo 开头："+str.startsWith("llo",2));
        System.out.println("----------------");
        //3.4 判断字符串是否以指定字符串结尾
        System.out.println("字符串是否以字符 a 结尾："+str.endsWith("a"));

    }
}
