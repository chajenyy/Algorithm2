package codingtest;

import java.util.Scanner;

public class Q1339 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String [] str = new String[n];
		System.out.println(n);
		
		for(int i = 0; i<n; i++) {
			str[i] = sc.next();
		}
		
		for(int i = 0; i<str.length;i++) {
		System.out.println(str[i]);
		}
		
		
		
		
	}

}
