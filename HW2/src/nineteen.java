import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("19�� ����");
		
		
		for(int i=0;i<10;i++) {
			System.out.println("���ڸ� �Է��ϼ���: ");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			if(a==0 || a==1) {
				System.out.println("�Ҽ��� �ƴմϴ�"); break;
			}
			else if (a%2==0)
			{System.out.println("�Ҽ��� �ƴմϴ�");
			break;}
			
			else 
				System.out.println("�Է���"+a+"�� �Ҽ��Դϴ�. ");
			    break;
			
		}
		System.out.println("=========���α׷�����========");
	}

}
