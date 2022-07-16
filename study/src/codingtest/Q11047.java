package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		int count=0;
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//내림차순으로 정렬해도 되지만 이게더 편함
		for(int i = N-1; i>=0; i--) {
			if(K>=arr[i]) {
				//몫이 곧 동전 개수이다
				count+= K/arr[i];
				//count된 동전의 금액을 제외한 나머지를 다시 K에 넣어줌
				K=K%arr[i];
			}
		}
		
		System.out.println(count);
		
	}
}
