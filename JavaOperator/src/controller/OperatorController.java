package controller;

import ifCondition.ArithmaticCalc2;
import ifCondition.CalcAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09. 성적계산기
		CalcAvg avg = new CalcAvg(); //CalcAvg의 Main method는 불르면 안된다.
	//	avg.calcAvg();
		//2015.07.09 사칙연산 계산
		ArithmaticCalc2 calc2 = new ArithmaticCalc2();
		calc2.calc();
		
	}
}
