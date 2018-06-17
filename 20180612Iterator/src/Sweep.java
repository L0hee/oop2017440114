import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs; //List: ������ ������ ����, Set: ������ ������ �Ұ���
//		strs = new HashSet<>(); //�ؽ��Լ� ������... �� ������ �� �� ����
//		strs = new TreeSet<> (); //���ĺ� ������ �����Ͽ� ����
		strs =  new LinkedHashSet<> (); //�Է¼�����...
		//�⺻�� �޼ҵ� add(), remove(), sweep...
		strs.add("trump");
		strs.add("jungen");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//ù��° �ȴ� ���: Iterator ���
		Iterator<String> e = strs.iterator();
		while(e.hasNext()) { //������ �ȴ�
			String str = e.next(); //�ϳ��� ������
			System.out.println(str);
		}
		//�ι�° �ȴ� ���: for() �ݺ��� ���
		for (String stri: strs) {//for (���Ÿ�� �����Լ�: �÷��� �Լ�)
			System.out.println(stri);
		}
	}
}


