package codingtest;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		String[] str = sc.nextLine().split("");
		
		int sum = 0;
		
		for(String x : str) {
			sum += Integer.parseInt(x);
		}
		System.out.println(sum);
		
	}

}
