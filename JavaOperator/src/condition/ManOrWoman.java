package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : Jin
 * @ Story :  switch 예제 (성 판별)
 */
public class ManOrWoman {
	//static 과 main을 지우고 이름을 설정 후 ()안에있는 내용을 없앤다
	public void ssn(){
		Scanner scanner = new Scanner(System.in);
		String msg="";
		System.out.println("주민번호를 입력하세요(예:800101-2123456)");
		String ssn = scanner.next();
		/* 
		 charAt(n) 이 메소드는 0부터 시작하여
		 n번째 글자 하나만 출력하는데 ,
		 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		 위 예제같은 상황에서는 리턴값이 2가 된다.
		 * */
		char ch = ssn.charAt(7); //index가 0부터이기때문에 count할때 0으로 시작 (string값에서 무엇을 뽑아낼때)
		/*
		 * ssn의 체계
		 * 1,3번 남자
		 * 2,4번 여자
		 * 5번 외국인
		 * 잘못 입력한 값임
		 * */
		switch (ch) {
		case '1': case '3': msg ="남성";break;
		case '2': case '4': msg = "여성"; break;
		case '5': msg="외국인";break;
		default:msg = "잘못입력한 값";break;
		}
		System.out.println("이렵하신 SSN은"+msg+"입니다.");
	}
}
