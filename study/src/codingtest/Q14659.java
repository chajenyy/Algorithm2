package codingtest;

import java.util.Scanner;

public class Q14659 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//豪快府荐
		int n = sc.nextInt();
		//豪快府臭捞
		int[] num = new int[n]; 
		
		int max = num[0];
		int maxindex = 0;
		
		int cnt = 0;
		
		for(int i =0; i<n; i++) {
			num[i]=sc.nextInt();
		}
		
		for(int i =0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
			for(int j = 0; j<num.length; j++) {
				if(max>num[j]) {
					cnt++;
				}else {
					
				}
			}
		}
		System.out.println(cnt);
		
		
		
	}

}
