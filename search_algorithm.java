package 두잇자바;

import java.io.IOException;
import java.util.Scanner;

public class search_algorithm {
// 	이 강의 검색 알고리즘에 관하여 진행 하는 목차입니다.
	
	//sequential search
	static int secSearch(int[] arr, int n, int key) {
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] == key) return i;
		}
		return -1;
		
		
		
	}
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < a.length; i ++) {
			System.out.println("x["+ i + "]: ");
			a[i] = sc.nextInt();
		}
		System.out.println("찾을 요소의 수를 입려하시오.");
		int ky = sc.nextInt();
		
		
		int idx = secSearch(a,num,ky);
		
		
		if( idx == -1 ) {
			System.out.println("찾으시는 요소의 값이 존재하지 않습니다.");
		}
		else {
			System.out.println("찾으시는 요소의 값은 x["+ idx + "] 에 있습니다.");
		}
		
		
		
		
	}

}
