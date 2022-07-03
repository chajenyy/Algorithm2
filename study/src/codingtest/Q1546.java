package codingtest;

import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] score = new int[n];
		double max = 0;
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i<n; i++) {
		 score[i] = sc.nextInt();
		 
		 if(score[i]>max) {
			 max=score[i];
		 }
			 
		}
		
		for(int i = 0; i<score.length; i++) {
			sum += (score[i]/max)*100;
		}
		avg = sum/n;
		
		System.out.println(avg);
		
	}
}
