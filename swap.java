import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swap {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr= new int[n];
		int tmp =0;
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		for(int i = 0; i< n/2;i++) {
			tmp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-i-1] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
