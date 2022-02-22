package a05_입력;

import java.util.Scanner;

public class ScoreEx {
	
	/**
	 * int score 입력
	 * score -점수 or 100 넘으면 x
	 * 90 이상 a 80 이상 b ... 60 이상 d 그외 f
	 * 
	 * 성적을 입력해 주세요: 00 
	 * 학생의 평점은 b등급입니다
	 */
	

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("성적을 입력해 주세요");
	
	int score = 0;
	String grade = null;
	score = sc.nextInt();
	
	grade = score > -1 && score < 101 ?
			score > 89  ? "A" :
				score > 79 ? "B" :
					score > 69 ? "C" :
						score > 59 ? "D" :
						    score > -1 ? "F" : "" :
						    	"X";
					    
	System.out.println("학생의 평점은: " + grade);
						    
	
	
		

	}

}
