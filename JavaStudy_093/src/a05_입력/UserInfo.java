package a05_입력;

import java.util.Scanner;

/*
 * import 단축키 Ctrl + Shift + o
 */

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * user name(아이디)
		 * password
		 * year
		 * month
		 * day
		 * name
		 * address 부산 동래구 사직동
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		String userName = scanner.next();
		String password = scanner.next();
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		String name = scanner.next();
		scanner.nextLine();//for buffer
		String address = scanner.nextLine();
		

		
		System.out.println("User Name: " + userName);
		System.out.println("password: " + password);
		System.out.println("birth: " + year + "/" + month + "/" + day);
		System.out.println("name: " + name);
		System.out.println("address: " + address);
		
		
	
	}

}
