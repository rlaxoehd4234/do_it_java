package 두잇자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binary_search {
	// 이번 강의 에서는 이전 검색에 대해 공부해보자. 
	// 이진 검색은 정렬이 되어 있다는 가정하에 실행하는 검색 알고리즘 입니다. 
	
	static int binary_ser(int[] arr, int n, int key) {
		
		int pf = 0;
		int pr = n -1;
		int count = 0;
		
		do {
			int pc = (pf+pr) / 2;
			
			if(arr[pc] == key) {
				binary_draw(arr, n ,count);
				return pc;
				
			}
			else if( arr[pc] < key ) {
				pf = pc +1;
			}
			else 
				pr = pc -1;
			
			count ++;
			
		}while(pf<=pr);
		
		binary_draw(arr, n ,count);
		return -1;
		
	}
	
	static void binary_draw(int[] arr , int n, int count) {
		
		int [][] array = new int [n][count];
		
		for(int i = 0; i < arr.length; i ++) {
			array[0][i] = arr[i];
			array[i][0] = i;
		}
		
		for(int i = 0 ; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("요소의 수를 입력하시오.");
		int n = Integer.parseInt(br.readLine());
		
		int [] a = new int[n];
		
		for(int i = 0; i < a.length; i ++){
			System.out.println("x["+ i +" ]: ");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("키 값을 입력하시오. ");
		int ky = Integer.parseInt(br.readLine());
		
		int result = binary_ser(a,n,ky);
		
		
		if(result == -1 ) {
			System.out.println("키 값을 찾을 수 없습니다. ");
		}
		else
			System.out.println("키 값은 x["+ result + "] 에 있습니다.");
		

	}

}
