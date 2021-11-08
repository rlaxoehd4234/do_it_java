import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fectorial {
	public static int sum(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total+= i;
		}
		
		return total;
		
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		sum(n);
		System.out.println(sum(n));

	}
}
