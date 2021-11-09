import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_14 {

	public static void main(String[] args) throws IOException {
		
		// 한변을 길이를 입력하고 길이에 해당하는 정사각형을 만드시오.
		
		//INPUT TYPE IS BUFFER
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int meter = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=meter; i++) {
			for(int j=1; j<=meter; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}

}
