package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 20220001 -> studentCode
		 * 이름: 김준일 -> name1, name2 name3
		 * 학년: 1 -> studentyear
		 * 성적: 85.5 -> score
		 * 평점: B -> grade
		 * 성별: 남-T 여-F
		 */
		
		int studentCode = 20220001;
		char name1 = '김';
		char name2 = '준';
		char name3 = '일';
		int studentYear = 1;
		double score = 85.5;
		char grade = 'B';
		boolean gender = true;
		
		
		System.out.println("학번: " + studentCode);
		System.out.print("이름: ");
		System.out.println(name1 + "" + name2 + "" + name3);
		System.out.print("학년: ");
		System.out.println(studentYear);
		System.out.print("성적: ");
		System.out.println(score + 5);
		System.out.print("평점: ");
		System.out.println(grade);
		System.out.print("성별: ");
		System.out.println(gender);
		
		

	}

}
