package 두잇자바;

import java.io.*;
import java.util.*;

public class Q_02_02 {
	// 배열 요소를 역순으로 나타내는 과정을 나타낸 프로그램을 작성하시오.
	
	static void reverse_arr(int[] arr) {
		int tmp = 0;
		for(int i =0; i < arr.length /2 ; i ++) {
			tmp = arr[i];
			arr[i] = arr[arr.length -1 - i];
			
			arr[arr.length -1 - i] = tmp;
			System.out.println("arr["+i+"] 와 arr["+ (arr.length-i-1) +"] 을 교환합니다. ");
			for(int j = 0; j < arr.length; j ++) {
				System.out.print(arr[j]+" ");
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = 0;
		
		System.out.println("배열의 요소수를 입력하시오.");
		n = Integer.parseInt(br.readLine());
		int []array = new int[n];
		
		System.out.println("배열의 요소를 입력하시오.");
		
		st= new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < array.length; i++ ) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		reverse_arr(array);
		
		

	}

}
