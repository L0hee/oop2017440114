
public class three {

	public static void main(String[] args) {
		// 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)
		System.out.println("3�� ����");
		int i;
		int sum = 0;
		i = 1;
		while (i<=100){ 
			if (i%3==0) {
				sum = sum + i;
			     i++;}
			else 
				i++;
			}
		System.out.println("Sum = " + sum);
		System.out.println("=========���α׷�����========");
		
		
	}

}
