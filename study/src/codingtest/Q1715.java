package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1715 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[]arr = new int[N];
		
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for(int i=1;i<N; i++) {
			count += N-i;
		}
		
		int[] sum = new int[count];
		
		for(int i=0; i<count;i++) {
			for(int x : arr) {
				sum[i] = +x;
			}
		}
		for(int x: sum) {
			System.out.println(x);
		}

			
	}
}
