import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		// ���� �������� 1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������, �� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.(�Է��� ��ȿ�� �˻�)
		System.out.println("9�� ����");
		
		int n;
		int i=1;
		System.out.println("������ �߿��� ����ϰ� ���� ���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n>9) {
			System.out.println("1���� 9������ ���ڸ� �Է��ϼ���");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			if (n<=9) {
				while (i<=9) {
				System.out.println(n+"x"+i+"="+n*i);
				i++;}
			}
				
		}
		else
		while (i<=9) {
			System.out.println(n+"x"+i+"="+n*i);
			i++;
		}
		}
	
			
	}
		
			
	



