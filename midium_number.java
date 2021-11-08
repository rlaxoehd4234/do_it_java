import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class midium_number {
	public static int midian(int a,int b,int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(a<=c)
				return a;
			else 
				return c;
		else if(a >c)
			return a;
		else if(c> a)
			return c;
		else
			return b;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//입력 방식은 buffer 입니다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("세 정수의 중앙값을 구합니다.");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		midian(x,y,z);
		System.out.println(midian(x,y,z));
		
		
		

	}

}
