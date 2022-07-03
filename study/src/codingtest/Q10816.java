package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//1 2 3   > 1,2,3 
		int n = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i =0; i<n;i++) {
			
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int count = 0;
		
		for(int i = 0; i<arr.size(); i++) {
			map.put(arr.get(i), count);
		}
		
		for(int x : arr) {
			 count = map.get(x);
			if(count == 0) {
				map.put(x, 1);
			}else {
				map.put(x,count+1);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] arrM = new int[m];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i<arrM.length; i++) {
			arrM[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<arrM.length;i++) {
			if(map.containsKey(arrM[i])) {
				//System.out.println( map.get(arrM[i]));
				bw.write(map.get(arrM[i])+" ");
			}else {
				//System.out.println(0);
				bw.write(0+" ");
			}
		}
		bw.flush();
	}
}


		
		
		
		
