import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("1�� ����");
		//1. �μ�(����)�� �Է¹޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ�
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		
		if (a>b)
			System.out.println(a);
		else
			System.out.println(b);
		System.out.println("=======���α׷� ����=====");

	}

}
