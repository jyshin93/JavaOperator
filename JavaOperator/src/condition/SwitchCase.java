package condition;

public class SwitchCase {
	public static void main(String[] args) {
		int flag = 1; // flag라는 변수는 기준값이란 의미로
		// 스위치 문에서 조건제어 변수로 많이 사용됨
		switch (flag) {//flag를 그대로 (condition)에 넣어준다 -->선언부의 변수
		case 1: System.out.println("1"); break; //case는 중복되면 안되며 case앞에는 선언부의 int 초기화 값을 준다
		case 2: System.out.println("2"); break; //case 숫자 겹치면 안된다
		case 3: System.out.println("3"); break;
		default: System.out.println("1부터 3범위 밖의 숫자"); break; //switch는 범위내의 값을 비교하거나 특정값을 비교할때 사용.
		}
	}
}
