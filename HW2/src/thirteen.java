import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
		// month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.

		System.out.println("13�� ����");
		int month=0;
		int day=0; 
		int total=0;
		do {
			System.out.println("month�� �Է��ϼ���: ");
			Scanner input = new Scanner(System.in);
			month=input.nextInt();
			if (month==2) {
				if (day>=1 && day<=28) {
					System.out.println("day�� �Է��ϼ���: ");
					Scanner scan = new Scanner(System.in);
					day=scan.nextInt();}
					
			else {System.out.println("day�� �Է��ϼ���: ");
				Scanner scan = new Scanner(System.in);
				day=scan.nextInt();
				break;}}
			
				
			while (month>=1 && month <13 && day>=1 && day<32);
			switch (month)
			{ case 1: total = day;	    break;
			case 2:  total = 31+ day;	    break;
			case 3:   total = 59+day; 	break;
			case 4:   total = 90+day; 	break;
			case 5:   total = 120+day; 	break;
			case 6:  total = 151+day; 	break;
			case 7:   total = 181+day; 	break;
			case 8:   total = 212+day; 	break;
			case 9:   total = 243+day; 	break;
			case 10:   total = 274+day;	 break;
			case 11:   total = 304+day; 	break;
			case 12:   total = 334+day; 	break;
			}
		} while(month<13);
		System.out.println(total +"�� �Դϴ�.");
		
		}
	
}
