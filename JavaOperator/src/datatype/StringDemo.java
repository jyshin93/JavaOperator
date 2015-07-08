package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : Jin
 * @ Story : String 타입 문법
 * */
public class StringDemo {
	public static void main(String[] args) {
		char c = 'c'; // 맨 끝에 있는 ; 세미컬럼 인데 이것을 구분자라고 부른다. (컴퓨터 상에서 마침표)
		// 카 데이터타입의 c 변수에 알파벳 c 값을 할당함
		System.out.println(c);
		// 알파벳 하나밖에 출력할 수 없다.
		String s = "abc";
		System.out.println(s);
		// 알파벳 하나는 싱글쿼터 여러개일때는 더블쿼터
		System.out.println("abc");
		// 알파벳 하나만 출력한 경우는 char 타입을 사용하고
		// 하나 이상 복수의 문자열을 출력할 때는 string 타입을 사용한다.
		// 주의할 점은 싱글쿼터와 더블쿼터에 유의
	}

}
