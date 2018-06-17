import java.util.*;

public class TestMap {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>(); //Ű�� ���ĺ� ����
		Map<String, String> map = new LinkedHashMap<>();
		//�߰�: .put(key, value)  valueã�� value = .get(key)
		map.put("���̴�", "û�ʹ�");
		map.put("Ʈ����", "��ǰ�");
		map.put("������", "�Ǿ�");
		
		System.out.println(map.get("���̴�")); //���̴��� value�� "û�ʹ�" ���
        
		//��ó: http://stove99.tistory.com/96
		// �ȴ� ���1: Ű���� ����� �� Ű���� Iterator���
        //Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet();//map.set(): map�� ����� ��Ʈ��(Ű, ��) �� Ű�� ���� Set, �� Key Set
		Iterator<String> itr = set.iterator();
        while( itr.hasNext() ) {
            String key = itr.next();
            System.out.println( String.format("Ű : %s, �� : %s", key, map.get(key)) );
        }
        //�ȴ� ��� 2: Ű���� ����� for()�ݺ��� ���
        for( String key : map.keySet() ) {
            System.out.println( String.format("Ű : %s, �� : %s", key, map.get(key)) );
        }
        //�ȴ� ���3: ��Ʈ������ ����� ���, ������ X
        for( Map.Entry<String, String> elem : map.entrySet() ) { //Map.Entry: �������̽�
            System.out.println( String.format("Ű : %s, �� : %s", elem.getKey(), elem.getValue()) );
        }
	}

}
