//1. 定义一个任务接口，在接口中声明核心任务。
interface SendFlower{
	void sendFlower();
}

//2. 定义一个子类，负责真实任务的完成，此处就是完成"小王给女朋友alice送花"的任务。
class BoySendFlower implements SendFlower{
	
	private String boyName;
	private String girlName;
	
	public BoySendFlower(String boyName,String girlName){
		this.boyName = boyName;
		this.girlName = girlName;
	}
	
	 public void sendFlower(){
		 System.out.println(this.boyName+"送花给"+this.girlName);
	 }
}

//3. 定义一个代理类，
class CourierSendFlower implements SendFlower{
	public SendFlower flower;
	public CourierSendFlower(BoySendFlower flower){
		this.flower = flower;
	}
	
	public void sendFlower(){
		System.out.println("快递员给客户打电话。");
		this.flower.sendFlower();
		System.out.println("客户签收。");
	}
}
class Factory{
	public static SendFlower getInstance(){
		return new CourierSendFlower(new BoySendFlower("小王","alice"));
	}
}

public class Test0006{
	public static void main(String[] args){
		SendFlower flower = Factory.getInstance();
		flower.sendFlower();
	}
}
