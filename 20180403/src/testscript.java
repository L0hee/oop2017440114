
public class testscript {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hllo");
		
		System.out.println(str1.equals(str2));//false ���� str1�� hello�ε� str2�� hllo�� ���� ������ �ٸ�
		  str1 = str2; //str2�� �ּҰ� str1�� ������
		System.out.println(str1==str2);//true ����
		 
	}

}
