package practice;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time();
		
		System.out.println("�⺻ ������ ȣ�� �� �ð�: ");
		System.out.println(time.toString());
		
		Time time2 = new Time(13,27,6);
		System.out.println("�ι�° ������ ȣ�� �� �ð�: ");
		System.out.println(time2.toString());
		
		Time time3 = new Time(99,66,77);
		System.out.println("�ùٸ��� ���� �ð� ���� �� �ð�: ");
		System.out.println(time3.toString());

	}

}
