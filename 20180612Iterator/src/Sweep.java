import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs; //List: 동일한 아이템 가능, Set: 동일한 아이템 불가능
//		strs = new HashSet<>(); //해쉬함수 순서로... 즉 순서를 알 수 없음
//		strs = new TreeSet<> (); //알파벳 순으로 졍렬하여 저장
		strs =  new LinkedHashSet<> (); //입력순으로...
		//기본적 메소드 add(), remove(), sweep...
		strs.add("trump");
		strs.add("jungen");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//첫번째 훑는 방법: Iterator 사용
		Iterator<String> e = strs.iterator();
		while(e.hasNext()) { //끝까지 훑다
			String str = e.next(); //하나씩 빼낸다
			System.out.println(str);
		}
		//두번째 훑는 방법: for() 반복문 사용
		for (String stri: strs) {//for (요소타입 참조함수: 컬렉션 함수)
			System.out.println(stri);
		}
	}
}


