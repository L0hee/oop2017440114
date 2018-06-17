
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina"); //업캐스팅
		Animal aCat = new Cat("망고"); //upcasting
		aDog.sing();
//error		aDog.playFetch();
		Dog gae = (Dog) aDog; //일시적으로 다운캐스팅
		gae.playFetch();//downcasting 
		aDog = new Cat("나비");
//		((Dog) aDog).playFetch();//runtime error
//error		aDog.playFetch();
//error		((Cat) aDog).playFetch();
		aCat = new Dog("해피");
		((Dog) aCat).playFetch(); //runtime error
		aCat.sing();

	}

}
