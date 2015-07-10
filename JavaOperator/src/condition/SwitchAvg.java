package condition;
/*
 * @ Date : 2015.07.10
 * @ Author : Jin
 * @ Story :  switch (합격여부구하기) 예제
 */
import java.util.Scanner;

public class SwitchAvg {
	public void switchAvg(){
		
		// 점수는 연산을 해야 되서 int 타입으로 정해져야 한다.
		//선언부
		String name = "",msg="";
		int kor=0, eng=0, math=0, sum=0, avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름:");
		name = scanner.next();
		System.out.println("국어 :");
		kor = scanner.nextInt();
		System.out.println("영어 :");
		eng = scanner.nextInt();
		System.out.println("수학");
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = (int)sum/3; //downcasting. 소수점 이하 버림.
		//연산부
		
		//아래 부분을 swtich-case로 전환
		
		switch (avg/10) {
		case 10:case 9: msg = "장학생"; break;
		case 8:case 7: msg = "합격"; break;
		default: msg="불합격";break;
		}
		
		
		
		//if (avg>=90) {
			//msg = "장학생";
		//}else if ((avg>=90) && (avg<90)) {
			//msg = "합격";
		//} else {
			//msg = "불합격";
					
			
		//}

		//출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("---------------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);
		
	}
}
