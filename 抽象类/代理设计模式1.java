
//1. 首先定义一接口，在接口中声明任务的方法。
interface Task{
	void buyPhone();
}
//2.定义一个子类作为真正的实现类实现接口，真正的完成买手机这一任务。
class RealTask implements Task{
	public void buyPhone(){
		System.out.println("买一部手机");
	}
}
//3. 定义另外一个子类作为代理类实现接口，该子类的作用是辅助真正完成任务的子类
//目的是在完成任务的基础上添加一些辅助功能。完善任务的操作。
class ProxyTask implements Task{
//3.1 通过定义Task类型的task属性
//3.2 在辅助类的构造方法中完成真正买手机这一任务。
	private Task task;
	public ProxyTask(RealTask task){
		 this.task = task;
	 }
//3.3 定义其他方法	 
	 public void productPhone(){
		 System.out.println("生产一部手机。");
	 }
	 public void servePhone(){
		 System.out.println("手机的售后服务。");
	 }
	
//3.4 在辅助类中完成买手机这一任务
//3.4.1 this直接调用的是	本类中的方法
//3.4.2 this.task调用的是RealTask类中的方法，该方法是真正的操作任务。 
	 public void buyPhone(){
		 this.productPhone();
		 this.task.buyPhone();
		 this.servePhone();
	 }
}
//4. 定义一个工厂用来进行实例化
//接口不能进行实例化，通过其子类进行实例化
class Factory{
	public static Task getInstance(){
		return new ProxyTask(new RealTask());
	}	
}


//定义测试类
public class Test0005{
	public static void main(String[] args){
		Task task = Factory.getInstance();
		task.buyPhone();
	}
}

