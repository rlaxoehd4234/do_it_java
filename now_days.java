package 두잇자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class now_days {
	//한 해의 경과 일 수를 계산하는 프로그램입니다. 
	
	static int[][] days = {{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,28,31,30,31,30,31,31,30,31,30,31}};
	
	static int isLeap(int year) {
		return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
		}
	
	static int dayOfYear(int y, int m , int d) {
		int day = d;
		
		for(int i = 1; i < m; i ++)
			day += days[isLeap(y)][i-1];
		return day;
	}
	static int leftDayOfYear(int y, int m, int d) {
		
		int total = 365;
		
		total = total - dayOfYear(y,m,d);
		return total;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y = 0;
		int m = 0;
		int d = 0;
		
		System.out.println("년:"); y= Integer.parseInt(br.readLine());
		System.out.println("월:"); m= Integer.parseInt(br.readLine());
		System.out.println("일:"); d= Integer.parseInt(br.readLine());
		
		System.out.println("지금까지의 일은" + dayOfYear(y,m,d)+ "입니다.");
		System.out.println("이번년도 남은 일은" + leftDayOfYear(y,m,d)+ "입니다.");
		
		
	}

}
