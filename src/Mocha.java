
public class Mocha extends CondimentDecorator {
	Beverage beverage;	//ตัวอ้างถึง สำหรับส่งเข้ามาว่าอะไรผสมมอคค่า

	public Mocha(Beverage beverage) {
		//TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		//TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		//TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}