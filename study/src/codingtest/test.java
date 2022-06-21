package codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test {
	static ArrayList<Integer> arr1;
	
	public static ArrayList<Integer> Solution(int[] arr) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		Integer count = null;
		for(int x : arr) {
			count = map.get(x);
			
			
			if(count ==null) {
				map.put(x, 1);
				
			}else {
				map.put(x, count+1);
			}
		}
		
		for(int key : map.keySet()) {
			list.add(map.get(key));
		}
		
		 arr1= (ArrayList<Integer>) map.values();
		
		
		//Iterator

		return list;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3};
		
		 System.out.println(Solution(arr));
		 
		 System.out.println(arr1);
	}
	
	

}
