package 두잇자바;

import java.util.Scanner;

public class CLASS {
	static final int VMAX =21;
	
	
	static class phyData{
		String name; 
		int height;
		double vision;
		
		public phyData(String name, int height, double vision) {
			this.height = height;
			this.name = name;
			this.vision = vision;
			
		}
	}
	static double aveHeight(phyData[] dat) {
		
		double sum = 0.0;
		for(int i = 0; i < dat.length; i ++) {
			sum += dat[i].height;
		}
		return sum / dat.length;
	}
	
	static void distVision(phyData [] dat, int[] dist){
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		phyData [] x = {
				new phyData("박현규",162,0.3),
				new phyData("이수진",173,0.7),
				new phyData("최윤미",175,2.0),
				new phyData("홍연의",171,1.5),
				new phyData("함진아",168,0.4),
				new phyData("김영준",174,1.2),
				new phyData("박용규",169,0.8),
		};
		int[] dist = new int[VMAX];
		
		System.out.println("ㅁ 신체검사 리스트 ㅁ");
		System.out.println("이름    키    시력");
		System.out.println("----------------");
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);
		}
		
		System.out.printf("평균 키 : %5.1fcm\n" , aveHeight(x));
	}

}
