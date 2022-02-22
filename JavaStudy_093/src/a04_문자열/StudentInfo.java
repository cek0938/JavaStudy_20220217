package a04_문자열;

public class StudentInfo {

	public static void main(String[] args) {
		//String name = "asdf";
		//System.out.println(name);
		/*
		 * 2022년 02월 22일 코리아아이티 아카데미부산 학생정보
		 * year month day academy(String) 
		 * 학생이름 : 내이름
		 * 
		 * 
		 */
		int i_year = 2022;
		
		String year = ""  + ++i_year;
		String month = "02";
		String day = "22";
		String academy = "코리아아이티 아카데미부산";
		String name = "김채은";
		
		
		//System.out.println(year + "년 " + month + "월 " + day + "일 \n"+ academy + "\n학생 이름: " + name);

		/*
		 * 문자열 형변환
		 * 문자열(String) -> Integer(int)
		 * Integer.parseInt("100"); -> 정수 100
		 * Double.parseDouble("15.123"); -> 실수 15.123
		 * Boolean.parseBoolean("true");
		 * 
		 * 정수 실수 등을 문자열로 형변환
		 * Integer.toString(100); -> 문자열 100으로 변화
		 * Double.toString(3.14); => 문자열 3.14
		 * Boolean.toString(true); => 문자열 true
		 */
		
		
		
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("0.12");
		System.out.println(dNum + 20);
		
		
		
		
		System.out.println(!Boolean.parseBoolean("true"));
		
		int num3 = 300;
		
		String num2 = Integer.toString(num3 + 200);
		System.out.println(num2);
		
		
		/*
		 * 표준입력
		 * Scanner - method() - next(), nextLine()
		 * 
		 * Scanner scanner = new Scanner(System.in)
		 * 
		 * 
		 */
		
		
	}

}
