
public class TestCar {
	
	public static void main(String[] args) {
	    System.out.println(Math.cos(0)); //Math.cos() : 정적 메소드(static method):객체를 생성하지 않고 사용할 수 있는 메소드, 정적변수만 access할 수 있음 객체 필요 없음
		Car myCar = new Car("Space blue", 300);
		//System.out.println(myCar.toString());
		System.out.println(myCar);
		System.out.println(myCar.numberOfCars);
		Car yourCar = new Car();
//		System.out.println(yourCar.numberOfCars);
		// 정적 변수는 "클라스명.정적변수명"으로도 접근할 수 있다.
//		System.out.println(Car.numberOfCars);
//		myCar.setColor("Black");
//		myCar.setSpeed(100);
//		System.out.println(myCar);
		System.out.println(yourCar);
		System.out.println(yourCar.numberOfCars); //numberofCars는 정적변수이기 때문에 모든 객체에서 공통으로 씀
	}

}
