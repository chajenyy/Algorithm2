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
		
		//������������ �����ص� ������ �̰Դ� ����
		for(int i = N-1; i>=0; i--) {
			if(K>=arr[i]) {
				//���� �� ���� �����̴�
				count+= K/arr[i];
				//count�� ������ �ݾ��� ������ �������� �ٽ� K�� �־���
				K=K%arr[i];
			}
		}
		
		System.out.println(count);
		
	}
}
