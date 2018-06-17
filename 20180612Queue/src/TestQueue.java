import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); //���ĺ� ������ �����
		strs.add("trump"); //ť �� ���� ��Ҹ� �߰�
		strs.add("jungen");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while (!strs.isEmpty()) {//for (���Ÿ�� �����Լ�: �÷��� �Լ�)
			System.out.println(strs.remove()); //ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ 
			Thread.sleep(1000); //1�� ��ٷ�!! (1�ʸ��� ���)
		}

	}

}
