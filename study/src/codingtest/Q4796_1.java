package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4796_1 {
	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = 0;
		int answer = 0;
		
		while(true){
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if(L==0 && P==0 && V==0) {
				break;
			}
			int day = (V/P)*L;
			int plus = V%P;
			
			if(plus<=L) {
				answer = day+plus;
			}else {
				answer = day+L;
			}
			
			count++;
			bw.write("CASE "+count+": "+answer+"\n");
		}
		bw.flush();
	}

}
