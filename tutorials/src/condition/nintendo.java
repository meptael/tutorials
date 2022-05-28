package condition;

import java.util.*;
public class nintendo {

	public static void main(String[] args) {
		System.out.println("메뉴 선택 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
	}

}
