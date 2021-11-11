import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_12 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		System.out.print(" "+"|");
		for(int i =1; i<=9; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print("---+");
		for(int i = 1 ; i<=9; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		for(int i =1; i<=9; i++) {
			System.out.print(i+"|");
			
			for(int j = 1; j <=9; j++) {
				System.out.print(i+j+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
