import java.util.Scanner;

public class twentyone {

	public static void main(String[] args) {
		// ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("21�� ����");
		int i,j;
		int sum = 0;
		i = 0;
		System.out.println("���ڸ� �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		for(j=2;i<a;i++)
		{for(j=2;j<=i;j++)
		{if (i==j)
			sum = sum + i;
		
	
		 if (i%j==0)
			{break;}
		}
		
	
		}
		{System.out.println(sum);}
		System.out.println("=========���α׷�����========");
		}
}


