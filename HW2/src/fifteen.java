import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		// 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)
		System.out.println("15�� ����");
		int num;
       int temp=53;
       
       
       for(int i=0;i<=10;i++)
       {  System.out.println("���ڸ� �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
	   num = input.nextInt();
	   if (temp>num)
		   System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�");
	   else if(temp<num )
		   System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�");
	   else if (temp==num) {
		   System.out.println("�����Դϴ�");
		   break;}
	   if (i==10) {
		   System.out.println("Game Over");
	   break;}
		   
	 
	}

}
}
