
public class five {

	public static void main(String[] args) {
		// 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do-while�� ���)
		System.out.println("5�� ����");
		int sum = 0;
		int i = 0;
		do {
		if (i%3==0) {
		sum = sum + i;
		i++;}
		else
			i++;
		
		} while (i<=100);
		
		System.out.println("Sum= " + sum);
		System.out.println("=========���α׷�����========");
		
		
	}

}
