public class Test0002{
	public static void main(String[] args){
		
		Coffee coffee = new Coffee();
		coffee.process();
		System.out.println("----------------------");
		Tea tea = new Tea();
		tea.process();
	}
}

//制作咖啡的流程
class Coffee{

	public void process(){
		this.boilWater();
		this.putWaterInputCup();
		this.putCoffeeInputCup();
		this.addMilkOrSugar();
	}
	
	public void boilWater(){
		System.out.println("1，将水煮沸");
	}
	
	public void putWaterInputCup(){
		System.out.println("2，将水倒入杯中");
	}
	
	public void putCoffeeInputCup(){
		System.out.println("3，将咖啡倒入水中");
	}
	
	public void addMilkOrSugar(){
		System.out.println("4，加牛奶或者糖");
	}
}
//制作茶的流程
class Tea{
	
	public void process(){
		this.boilWater();
		this.putWaterInputCup();
		this.putTeaInputCup();
		this.addLemon();
	}
	
	public void boilWater(){
		System.out.println("1，将水煮沸");
	}
	
	public void putWaterInputCup(){
		System.out.println("2，将水倒入杯中");
	}
	
	public void putTeaInputCup(){
		System.out.println("3，将茶叶倒入水中");
	}
	
	public void addLemon(){
		System.out.println("4，加柠檬");
	}
}
