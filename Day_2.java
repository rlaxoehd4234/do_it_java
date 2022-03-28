package 두잇자바;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Day_2 {
	
	static int maxOF(int[] a) {
		
		int max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) 
				max = a[i];
		}
		return max ;
	}

	public static void main(String[] args) throws IOException {
		
		int num = 0 ;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		num = rand.nextInt(100);
		int [] height = new int [num];
		System.out.println("사람의 수는"+ num + "명 입니다.");
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i = 0; i< height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println(height[i]);
		}
		
		System.out.println("키의 최대값"+maxOF(height)+"입니다.");
	}

}
