import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		System.out.println("7�� ����");
		int sum;
		sum = 0;
		int a=1;
		while (a!=0) {
		System.out.println("������ �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		sum = sum + a;
		}
		System.out.println("Sum= " + sum);
		System.out.println("=========���α׷�����========");
		
		
		
	}

}
