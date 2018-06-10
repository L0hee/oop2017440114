import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AnimalSing {
	List<Animal> list;//Animal의 자식클라스를 가질 수 있다.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	//일단 형변환을 하는 궁극적인 목적이 메서드의 매개변수를 모두 통일할 수 있는 
	//장점을 가지고 있기에 그렇다라고 이해할 수 있지만
	void add(Animal ele) {
		list.add(ele);
	}
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing();//Polymorphism
		}
	}

}
