package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		
		Iterator<String> it = arr.iterator();
//		//[bof aaa bbb ccc eof]
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<String> set = new HashSet<>();
		set.add("set aaa");
		set.add("set bbb");
		set.add("set ccc");
		Iterator<String> it1 = set.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}
}
