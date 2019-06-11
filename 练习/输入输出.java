import java.util.Scanner;
public class Scanner1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//声明Scanner对象
		System.out.println("请输入信息：");//提示用户输入信息
		String string = scanner.next();//定义string变量接受信息
		System.out.println("输入的信息为："+string);//输出信息
	}
}
import java.util.Scanner;
public class Scanner1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);//声明Scanner对象
		System.out.print("请输入数字：");//提示用户输入数字
		int num1 = scanner.nextInt();//定义一个变量接收数字
		int num2 = num1*2;//计算值
		System.out.println("结果为："+num2);//输出计算结果
	}
}
