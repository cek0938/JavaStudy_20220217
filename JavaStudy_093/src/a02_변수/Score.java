package a02_변수;

public class Score {

	public static void main(String[] args) {
		double kor = 80.5;
		double eng = 90.0;
		double math = 75.8;
		
		double avg= 0;
		double total = 0;
		
		int iAvg = 0;//각각의 점수에서 소숫점을 뺀 평균
		int iTotal = 0; //각각의 점수에서 소숫점을 뺀 합계

		avg = (kor + eng + math) / 3;
		total = kor + eng + math;
		

		iTotal = (int) total;
		iAvg = (((int)kor +(int)eng + (int)math)/3); 
		
		System.out.println("합계1: " + total);
		System.out.println("평균1: " + avg);
		System.out.println("합계2: " +iTotal);
		System.out.println("평균2: " +iAvg);
		
	}
	

}
