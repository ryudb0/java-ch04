
public class Ex4_26 {
	public static void main(String[] args) {
		int sum =0; 
		int i =0; 
		
		while((sum+=++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
		
		System.out.println("sum="+sum+", i="+i);
	}

}
