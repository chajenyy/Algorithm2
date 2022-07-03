package codingtest;

import java.util.Scanner;

public class Q4796 {
	public static void main(String[] args) {
		//¿¹¿Ü 3 8 20 == 9
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int answer = 0;
		while(true) {
			
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			
			if(L==0 && P==0 && V==0) {
				break;
			}
			//3 8 20
			int day = (V/P)*L;
			int plus = V%P;
			
			if(plus<=L) {
				answer = day+plus;
			}else {
				answer = day+L;
			}
			
			count++;
			
			System.out.println("CASE "+count+": "+answer);
			
		}
	
	}
}
