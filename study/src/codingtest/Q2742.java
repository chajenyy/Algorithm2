package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		br.close();
//		
//		for(int i = 0; i<n; i++) {
//			bw.write(n-i);
//		}
//		bw.flush();
//		bw.close();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println(n-i);
		}
		
		
	}

}
