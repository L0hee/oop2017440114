
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina"); //��ĳ����
		Animal aCat = new Cat("����"); //upcasting
		aDog.sing();
//error		aDog.playFetch();
		Dog gae = (Dog) aDog; //�Ͻ������� �ٿ�ĳ����
		gae.playFetch();//downcasting 
		aDog = new Cat("����");
//		((Dog) aDog).playFetch();//runtime error
//error		aDog.playFetch();
//error		((Cat) aDog).playFetch();
		aCat = new Dog("����");
		((Dog) aCat).playFetch(); //runtime error
		aCat.sing();

	}

}
