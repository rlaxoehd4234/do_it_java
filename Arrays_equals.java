package 두잇자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_equals {
	static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) return false;
		
		for(int i = 0 ; i < a.length; i ++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		
		return true;
	}
	static void copy(int []a, int[] b) {
		if(a.length != b.length) {
			return ;
		}
		
		else
			for(int i = 0 ; i < a.length; i++) {
				b[i] = a[i];
			}
		
	}
	static void rcopy(int[]a, int[]b) {
		int tmp = 0 ;
		if(a.length != b.length) {
			return;
			
		}
		else 
			for(int i = 0 ; i < a.length / 2; i ++) {
				tmp = b[a.length / 2 - 1 ];
				a[i] = tmp;
			}
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader ( System.in));
		int na = 0;
		int nb = 0;
		
		System.out.println("배열 a의 요솟수를 입력하시오. ");
		na = Integer.parseInt(br.readLine());
		int []aarr = new int[na];
		for(int i = 0; i < aarr.length; i ++ ) {
			aarr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("배열 b의 요솟수를 입력하시오. ");
		nb = Integer.parseInt(br.readLine());
		int [] barr = new int[nb];
		for(int i = 0; i < barr.length; i ++ ) {
			barr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("배열 a와 b 는 " + (equals(aarr,barr) ? " 같습니다" : " 같지않습니다."));
		
		
		
		
	}

}
