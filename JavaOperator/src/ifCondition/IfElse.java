package ifCondition;

public class IfElse {
	public static void main(String[] args) {
		int x =1, y= 2; // 지변 초기화
		if ((x==1) && (y==1)) { // && 엔퍼센트라고 읽고 and 연산자 이다.
			System.out.println("x 는 1 이면서, y도 2이다.");
		}else if ((x==1)||(y==1)) { // ||는 컬럼으로 읽고 or 연산자 이다.
			System.out.println("x는 1 이거나, y는 2이다.");
		}else{
			System.out.println("해당사항이 없습니다");
		}
	}
}
