package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Jin
 * @ Story :  if-else 예제
 * 		프로그램을 개발해야 합니다.
 *  오더는
 *  학생		국어	영어	수학	총점	평균	합격여부
 *  ---------------------------------------------------------
 *  (홍길동)	(90)	(90)	(90)	(270)	(90)	(장학생)
 *  
 *  평균이 90점 이상이면 장학생
 *  평균이 70점 이상 - 90점 미만이면 합격
 *  평균이 70점 미만이면 불합격
 * */
public class CalcAvgmain {
	public static void main(String[] args) {
		
		String hong = "";
		int kor = 0, eng = 0, math = 0, total=0, avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		hong = scanner.next();
		System.out.println("국어 점수를 입력하세요");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scanner.nextInt();
		total = kor+eng+math;
		avg=total/3;
		
		if (avg >= 90) {
			System.out.println("장학생");
		}else if ((70<=avg) || (avg < 90)) {
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}//틀린점은 sysout말고 if else에서는 바로 string으로 메세지를 전달 할 수 있음.!!!!
		
	}

}
