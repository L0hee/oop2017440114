import java.util.*;

public class TestQueue {
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); //알파벳 순으로 저장됨
		strs.add("trump"); //큐 맨 끝에 요소를 추가
		strs.add("jungen");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while (!strs.isEmpty()) {//for (요소타입 참조함수: 컬렉션 함수)
			System.out.println(strs.remove()); //큐 맨 앞에서 요소를 제거하여 그 요소를 반환 
			Thread.sleep(1000); //1초 기다려!! (1초마다 출력)
		}

	}

}
