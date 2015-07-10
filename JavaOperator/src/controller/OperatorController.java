package controller;

import condition.ArithmaticCalc2;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09. 성적계산기
		CalcAvg avg = new CalcAvg(); //CalcAvg의 Main method는 불르면 안된다.
	//	avg.calcAvg();
		//2015.07.09 사칙연산 계산
		ArithmaticCalc2 calc2 = new ArithmaticCalc2();
		//calc2.calc();
		//2015.07.10. 스위치 성적계산기
		SwitchAvg avg2 = new SwitchAvg();
		//avg2.switchAvg();
		//2015.07.10스위치 성 구분
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn(); // ssn()원 클래스의 메소드 이름이다.
	}
}
