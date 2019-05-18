//导入包
import java.util.Scanner;
//1.定义接口
interface Phone{
	void printInfo();
}

//2. 子类实现接口
class Iphone implements Phone{
	public void printInfo(){
	  System.out.println("这是一部苹果手机。");
	}
}

class Huawei implements Phone{
	public void printInfo(){
		System.out.println("这是一部华为手机。");
	}
}

//3. 定义实例化工厂
//若有新的需求，则可以在工厂中直接修改
class Factory{
	public static Phone getInstance(String type){
		Phone phone = null;
		if(type.equals("iphone")){
			phone = new Iphone();
		}else{
			phone = new Huawei();
		}
		return phone;
	}
}

//客户端
public class Client{
	
	public void buyPhone(Phone phone){
		phone.printInfo();
	}
	
	public static void main(String[] args){
		Client client = new Client();
		Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要的手机型号...");
		String type = scanner.nextLine();
		Phone phone = Factory.getInstance(type);
		client.buyPhone(phone);
		
	}
}

