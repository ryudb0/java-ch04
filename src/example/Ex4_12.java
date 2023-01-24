package example;

public class Ex4_12 {
	public static void main(String[] args) {
//		이거진짜 모르겠어
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=3; j++) {
				int x = 0;		// 단
				int y = i%3==0 ? 3 : i%3;		// 곱하는수
				
				System.out.println(x+"*"+y+"="+x*y);
				
				
			}
		}
		
		
		
	}

}
