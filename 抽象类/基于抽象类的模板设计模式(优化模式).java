//1，父类，制作饮品
abstract class Drink{
//1.1 制作饮品的流程
	 public final void makeDrink(){
		 this.boilWater();
		 this.putWaterInputCup();
		 this.putMagorInputCup();
//1.2 对于是否添加辅料，可以灵活变通
		 if(this.isAddOthers()){
			this.addOthersInputCup();
		 }
		 
	 }
//1.3 	流程中的两个固定方法 ,且不可修改
	 public final void boilWater(){
		 System.out.println("1，将水煮沸");
	 }
	 public final void putWaterInputCup(){
		 System.out.println("2，将水倒入杯中");
	 }
//1.4 流程中的两个抽象方法，加材料和加辅料，具体实现交由子类完成。 
	 public abstract void putMagorInputCup();
	 public abstract void addOthersInputCup();
//1.5 对于是否添加辅料，要在子类中具体确定
	 public boolean isAddOthers(){
		 return true;
	 }
}

//2，咖啡的制作流程
class Coffee extends Drink{
	public void putMagorInputCup(){
		System.out.println("3,将咖啡倒入水中");
	}
	public void addOthersInputCup(){
		System.out.println("4,加牛奶或者糖");
	}
}

//3，茶的制作流程
//在tea子类的具体实现中，判断要不要加辅料
class Tea extends Drink{
	private boolean isAddOthers = true;
	
	public Tea(boolean isAddOthers){
		this.isAddOthers = isAddOthers;
	}
	public void putMagorInputCup(){
		System.out.println("3,将茶叶倒入水中");
	}
	public void addOthersInputCup(){
		System.out.println("4,加柠檬");
	}
	
	public boolean isAddOthers(){
		return isAddOthers;
	}
}

//4， 果汁的制作流程
class Juice extends Drink{
	public void putMagorInputCup(){
		System.out.println("3,将浓缩果汁倒入水中");
	}
	public void addOthersInputCup(){
		System.out.println("4,加冰块");
	}
}

//定义测试类，实例化对象
public class Test0002{
	public static void main(String[] args){
		
		Drink coffee = new Coffee();
		coffee.makeDrink();
		 System.out.println("----------------------");
		 Drink tea = new Tea(false);
		 tea.makeDrink();
		 System.out.println("----------------------");
		 Drink juice = new Juice();
		 juice.makeDrink();
	}
}

