import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MAX_FOUR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[]arr = new int[n];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		
		
		
	}

}
