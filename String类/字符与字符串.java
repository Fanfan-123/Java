public class String类方法的使用 {
    public static void main(String[] args) {
        String str = "hello world hello China!";

        //1.字符与字符串
        //1.1 字符串->获取指定位置的字符
        char c = str.charAt(3);
        System.out.println("获取下标为3的元素为："+c);
        System.out.println("---------------------");
        //1.2 字符串转化为字符数组
        char[] ch = str.toCharArray();
        System.out.println("字符串转化成的字符数组为："+ch);
        System.out.println("---------------------");
        //1.3 将字符数组中ch的所有元素变为字符串
        String str1 = new String(ch);
        System.out.println("将字符数组全部变为字符串："+str1);
        System.out.println("---------------------");
        //1.4 将字符数组中ch的部分内容变为字符串
        String str2 = new String(ch,2,5);
        
        System.out.println("从数组下标为2的元素开始，将五个元素转化为字符串："+str2);
    }
}
