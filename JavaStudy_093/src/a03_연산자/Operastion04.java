package a03_연산자;

public class Operastion04 {
	
	/*
	 * 논리연산자(boolean)
	 * AND - && - 곱
	 * OR - || -합
	 * NOT - ! - 부정
	 *true (1), false(0)
	 *
	 * true && true = true
	 * true && false = false
	 * 
	 * true || true = true
	 * true || false = true
	 * false || false = false
	 * (||모든 조건이 false 일때)
	 * 
	 * !(true || true ) => false
	 * !(true || false => false)
	 * 
	 */

	public static void main(String[] args) {
		int score = 88;
		boolean result;
		//score 음수 안됨 100초과 안됨
		result = !(score < 0 || score > 100);
		
		System.out.println("결과: " + result);
		
		char grade = 'A';

		boolean result2;
		//grade 소문자여도 됨 대문자여도됨 a,b,c,A,B,C 외에는 false 
		
		result2 = grade == 'a' || grade == 'b' || grade == 'c' || grade == 'A' || grade == 'B' || grade == 'C';
		System.out.println("결과: " + result2);
		



	}

}
