package list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		arr.add("ccc");
		System.out.println(arr.indexOf("bbb"));
		System.out.println(arr.indexOf("bbb22"));
		System.out.println("==== set ====");
		System.out.println(arr);
		arr.remove("bbb");
		arr.add("bbb");
		arr.add(1,"홍길동");
		System.out.println(arr);
		arr.set(1, "김개똥");
		System.out.println(arr);
	}
}
