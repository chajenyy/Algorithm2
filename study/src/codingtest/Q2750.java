package codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2750 {
	public static void main(String[] args) {
		int temp;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if(list.get(i)<list.get(j)) {
					temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
				}
			}
		}//for end
		
		for(int x : list) {
			System.out.println(x);
		}
		
		
	}

}
