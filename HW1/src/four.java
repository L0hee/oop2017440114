import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		System.out.println("4�� ����");
		int score;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
		score = input.nextInt();
		
		if (score >= 80) {
			System.out.println("A");
		}
		else if	(score >= 60)
			System.out.println("B");
		else if (score >= 40)
			System.out.println("C");
		else if (score >= 20)
			System.out.println("D");
		else if (score >= 0)
			System.out.println("E");
		
		System.out.println("=======���α׷� ����=====");
		
	}

}
