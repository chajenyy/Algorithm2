package codingtest;

import java.util.ArrayList;
import java.util.Scanner;



public class test3 {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] strArray = str.split("");
		
		for(String x : strArray) {
			//System.out.println(x);
			
			arr.add(x);
		}
		System.out.println(arr);
		//+3   A: 65  Z : 90
		
		
		System.out.println("-----------------------------");
		
		String str2 = String.join("", arr);
		
		System.out.println(str2);
		
		
		System.out.println("-----------------------------");
		
//	      // BufferedReader 사용이 더 빠르다.
//	      Scanner sc = new Scanner(System.in);
//	      
//	      System.out.print("단어 입력 : ");
//	      
//	      String cipher = sc.next();
//	      String result="";
//	      
//	      for(int i=0; i<cipher.length();i++) {
//	         char t = cipher.charAt(i);
//	         
//	         // 65 66 67 ==> A B C
//	         if(t<= 67) {
//	            result += (char)(t+23);
//	         }else {
//	            result += (char)(t-3);
//	         }
//	      }
//	      
//	      System.out.println("result : "+result);
//	      sc.close();
	}

}
