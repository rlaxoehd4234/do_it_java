package 두잇자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day_2_1 {
	
	static void change(int[] arr)
	{	int tmp = 0;
		for(int i = 0 ; i < arr.length /2 ; i ++) {
			tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
			
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] array = new int[9];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		System.out.println("기존의 배열은");
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			System.out.print(array[i] + " ");
			
		}
		
		
		change(array);
		
		System.out.println();
		
		for(int i = 0 ; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
