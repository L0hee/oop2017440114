
public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		
		box.set(str); 
		System.out.println("The box has " + box.get());
		
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		
		ibox.set(i); 
//error		ibox.set(new String("chois"));
		System.out.println(100 + ibox.get());
	}
}
//컬렉션: 가방,  인터페이스와 구현클라스를 구분
//스택: 집어넣은 것 중 가장 최근 것이 나옴
//큐: 줄 서는 것
//리스트: 끼워넣기, replace 가능	



