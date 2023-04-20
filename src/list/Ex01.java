package list;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 collection
		 - 데이터의 집합 구조
		 - 공간의 크기가 유동적이다
		 framework
		 - 기본 틀
		 
		 collection framework
		 - List
		   	- 순서가 존재한다.
		   	- 데이터의 중복은 허용 가능
		 - Map
		 - Set
		 */
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
		  System.out.println(arr.get(0)); System.out.println(arr.get(1));
		  System.out.println(arr.get(2));
		System.out.println("=== for ===");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("=== for each ===");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("============");
		int n1 = 100;
		Integer n2 = 200;
		
		System.out.println(n2); 
		ArrayList<Integer> arr02 = new ArrayList<>();
		arr02.add(111);
//		arr02.add("111");
		 
	}
}
