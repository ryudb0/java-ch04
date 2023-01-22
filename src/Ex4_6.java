import java.util.Scanner;

public class Ex4_6 {
	public static void main(String[] args) {
		System.out.print("현재의 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
		case 1: case 2: case 3:
			System.out.println("현재의 계절은 봄입니다."); break;
		case 4: case 5: case 6:
			System.out.println("현재의 계절은 여름입니다."); break;
		case 7: case 8: case 9:
			System.out.println("현재의 계절은 가을입니다."); break;
		default:
			System.out.println("현재의 계절은 겨울입니다."); 
		}
	}

}
