import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_16 {
	static void spira(int n) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n-1-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<(2*i)-1;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		spira(n);

	}

}
