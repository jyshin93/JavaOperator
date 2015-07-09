package operator;

import java.util.Scanner;

public class InvestingModel {
	public static void main(String[] args) {

		// DCF(5년) 활용 적정주가
		// = ( BPS x ( 1+ ROE )^5 ) / (( 1+ 투자자 목표수익률(예 15%) )^5 )
		// [출처] 적정주가(가치) 계산법 정리 (가치투자연구소) |작성자 박정전화영어4만원

		int BPS = 0;
		double  ROE=0, DCF=0,b= 0;
		String a = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("종목의 이름을 기입하시오");
		a = scanner.next();
		System.out.println("목표수익률을 입력하시오");
		b = scanner.nextDouble();
		System.out.println("해당 종목의 BPS를 입력하시오");
		BPS = scanner.nextInt();
		System.out.println("해당 종목의 ROE를 입력하시오");
		ROE = scanner.nextDouble();
		
		DCF = (BPS*((1+ROE)*(1+ROE)*(1+ROE)*(1+ROE)*(1+ROE)))/ ((1+b)*(1+b)*(1+b)*(1+b)*(1+b));
		System.out.println("해당 종목의 적정 주가는:"+DCF);
		
	}

}
