package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10162 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 300;
		int B = 60;
		int C = 10;
		
		int T = Integer.parseInt(br.readLine());
		
		int countA = 0;
		int countB = 0;
		int countC = 0;
		
		if(T%C != 0) {
			System.out.println(-1);
		}else if(T%C ==0) {
			if(T/A > 0) {
				countA += T/A;
				T=T%A;
			}if(T/B> 0) {
					countB += T/B;
					T=T%B;
			}if(T/C>0) {
					countC += T/C;
			}
			System.out.println(countA+" "+countB+" "+countC);
		}
		
		
	}

}
