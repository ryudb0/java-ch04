package example;

public class Ex4_4 {
	public static void main(String[] args) {
		int tmp =0;
		int sum = 0;
		for(int i=1; ; i++) {
			tmp = i;
			if(i%2==0) {
				tmp = -tmp;
			}
			sum += tmp;
			if(sum>= 100) break;
		}
		System.out.println(tmp);
		System.out.println(sum);
	}
	
}
