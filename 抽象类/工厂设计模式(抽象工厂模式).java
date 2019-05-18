
interface Phone{
	
	void printInfo();
}

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

interface OperationSytem{
	void printSystem();
}

class Android implements OperationSytem{
	public void printSystem(){
		System.out.println("该操作系统是安卓系统。");
	}
}
class Ios implements OperationSytem{
	public void printSystem(){
		System.out.println("该操作系统是iOS操作系统。");
	}
}

interface Factory{
	Phone createPhone();
	OperationSytem createSystem();
}

class AppleFactory implements Factory{
	public Phone createPhone(){
		return new Iphone();
	}
	public OperationSytem createSystem(){
		return new Ios();
	}
}

class OtherFactory implements Factory{
	public Phone createPhone(){
		return new Huawei();
	}
	public OperationSytem createSystem(){
		return new Android();
	}
}


//客户端
public class Client{
	
	public void buyPhone(Phone phone){
		phone.printInfo();
	}
	public void useSystem(OperationSytem operation){
		operation.printSystem();
	}
	
	public static void main(String[] args){
		Client client = new Client();
		
		Factory factory = new AppleFactory();
		client.buyPhone(factory.createPhone());
		client.useSystem(factory.createSystem());
		
	}
}

