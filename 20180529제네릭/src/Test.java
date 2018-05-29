
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str); //Upcasting
//		String str1 = "Mr." + box.get();
		
		//int: primitive type, Integer: reference type
		Integer i ; 
		//i = 3;
		i = new Integer(3);
		System.out.println(i);
		
		System.out.println("the box contain " + box.get());
		int a = 10;
		box.set(a); //autoboxing
		System.out.println(10 + (Integer) box.get());
	}

}
