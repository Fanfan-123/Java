//1. 定义产品抽象类
interface Phone{
	void printInfo();
}
//2. 定义多个产品实现类
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

//3. 定义一个抽象工厂类
//该抽象类用来实例化，但是对于具体的实例化交由子类实现，符合开闭原则
interface Factory{
	Phone createPhone();
}

//4.定义多个产品工厂，每个产品类对应的实例化 
class IphoneFactory implements Factory{
	public Phone createPhone(){
		return new Iphone();
	}
}

class HuaweiFactory implements Factory{
	public Phone createPhone(){
		return new Huawei();
	}
}


//客户端
public class Client{
	
	public void buyPhone(Phone phone){
		phone.printInfo();
	}
	
	public static void main(String[] args){
		Client client = new Client();
		Factory factory = new HuaweiFactory();
		client.buyPhone(factory.createPhone());
		
	}
}

