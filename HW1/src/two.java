import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2�� ����");
		//�ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		
		if (a%2==0) {
			System.out.println("¦��");}
		else {
			System.out.println("Ȧ��");
		}
		System.out.println("=======���α׷� ����=====");

	}

}
