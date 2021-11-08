import java.util.Scanner;

public class gauss_theorem {
	
	public static int gauss(int n) {
		int total = (n*(n+1)) /2;
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		gauss(n);
		
		System.out.println(gauss(n));

	}

}
