package condition;

import java.util.Scanner;

public class CalcAvg {
	public void calcAvg(){//일반 method 안에 가지고 온다.
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
				if (avg>=90) {
					msg = "장학생";
				}else if ((avg>=90) && (avg<90)) {
					msg = "합격";
				} else {
					msg = "불합격";
							
					
				}

				//출력부
				System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
				System.out.println("---------------------------------------------------------------");
				System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+msg);
	}
}
