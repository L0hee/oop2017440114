
public class TestString {

	public static void main(String[] args) {
		int a = 10;// int���� ���� a ���� + �� 10�� a�� ���� //a�� ����(primitive) ����
		//string ��ü ���� ���
//		String str;//Ŭ�� ��Ʈ���� ��ü�� ��Ʈ���� ������ �� �ִ� ���� ����(���۷��� ����) ���� //String: Ŭ�� �̸� //str�� ����(reference) ����
//		str = new String("Hello darkness my old friend.");//��ü����
		String str = new String("Hello darkness my old friend.");
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�()
		int len = str.length();
		System.out.println("string length is "+ len);
		
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: "+ str1);
	}

}
