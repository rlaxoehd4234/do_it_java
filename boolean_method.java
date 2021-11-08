import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boolean_method {
	//정순으로 배열의 값을복사하는 메소드
	static void copy(int[] a, int[] b) {
		for(int i = 0; i<a.length; i++) {
			a[i] = b[i];
			
		}
	}
	//역순으로 배열의 값을 복사하는 메소드
	static void reversecopy(int[]a,int[]b) {
		for(int i =0; i<a.length; i++) {
			a[a.length-i-1]=b[i];
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[5];
		int[] b = {1,2,3,4,5};
		
		
		copy(a,b);
		reversecopy(a,b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		

	}

}
