
public class TestCar {
	
	public static void main(String[] args) {
	    System.out.println(Math.cos(0)); //Math.cos() : ���� �޼ҵ�(static method):��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�, ���������� access�� �� ���� ��ü �ʿ� ����
		Car myCar = new Car("Space blue", 300);
		Car.print();
//		System.out.println(myCar.numberOfCars);
		Car yourCar = new Car();
//		System.out.println(yourCar.numberOfCars);
		// ���� ������ "Ŭ�󽺸�.����������"���ε� ������ �� �ִ�.
//		System.out.println(Car.numberOfCars);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
//		System.out.println(myCar);
//		System.out.println(yourCar);
	}

}
