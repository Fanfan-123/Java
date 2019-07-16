public class String类方法的使用 {
    public static void main(String[] args) {
        String str = "hello world hello China!";
        //4. 字符串替换
        //4.1 全部替换
        String str1 = str.replaceAll("l","c");
        System.out.println("将字符串str中的所有“l”替换成“c”："+str1);
        System.out.println("---------------");
        //4.2 第一个指定的元素替换
        String str2 = str.replaceFirst("1","c");
        System.out.println("将字符串str中的第一个“l”替换成“c”："+str1);
        System.out.println("---------------");

    }
}
