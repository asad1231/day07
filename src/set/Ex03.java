package set;

import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<String> name = new HashSet<>();
		String n;
		while(true) {
			System.out.println("이름 입력");
			n = input.next();
			boolean bool = name.add(n);
			System.out.println(bool);
			if(!bool) { //bool == false
				System.out.println("존재하는 이름입니다");
			}else {
				System.out.println("저장완료");
			}
		}
	}
}
