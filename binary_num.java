package 두잇자바;

import java.io.IOException;

public class binary_num {
	//소수를 구하는 프로그램입니다. 
	public static void main(String[] args) throws IOException {
		/* version 1
		int counter = 0; 
		
		for(int n = 2; n <=1000; n ++) {
			int i;
			for(i = 2; i <n; i++) {
				counter ++;
				if(n%i == 0) {
					break;
				}
			}
				if(n == i) {
					System.out.println(n);
				}
			
			
		}
		System.out.println("나눗셈을 수행한 횟 수 " + counter);*/
		
		// version 2
		
		int counter = 0;
		int ptr = 0 ;
		int [] prime = new int [500];
		
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n +=2) {
			int i; 
			for(i =1; i <ptr;i++) {
				counter++;
				if(n % prime[i] == 0)
					break;
			}
			if(ptr == i )
				prime[ptr++] = n;
		}
		for (int i = 0 ; i< ptr; i++)
			System.out.println(prime[i]);
		System.out.println(counter);
		
	} 
		
		

}
