import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("3�� ����");
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ�: ");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�: ");
		b = input.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ�: ");
		c = input.nextInt();
		
		if (a>b) {
			if (a>c)
				System.out.println(a);}
		else {
			if (b>c)
				System.out.println(b);
			else
				System.out.println(c);}
		System.out.println("=======���α׷� ����=====");

				
	}

}
