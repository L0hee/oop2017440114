import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		
		   System.out.println("6�� ����");
		   
		   int a, b, c;
		   Scanner input = new Scanner(System.in);
			System.out.println("�� �ڸ� ������ �Է��Ͻÿ�: ");
			a = input.nextInt();
			c = a % 10;
			b = a-c;
			System.out.println(10*c + b/10);
			
			System.out.println("=======���α׷� ����=====");
			input.close();
		   
		   
	}

}
