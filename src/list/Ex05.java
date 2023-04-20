package list;

import java.util.ArrayList;

public class Ex05 {
	//ArrayList 선언 후 10부터 100까지 10단위로 넣어주세요(반복문 이용)
	//그후 10이 들어있는 다음 인덱스에 15 를 넣어주세요 (10이 들어있는지 확인)
	//그후 60을 600으로 수정하고 90을 삭제한다음 (60,90이 들어있는지 확인)
	//ArrayList를 출력해주세요
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			arr.add(i*10);
		}
		
		if(arr.contains(10)) {
			arr.add(arr.indexOf(10)+1, 15);
		}
		
		int num = arr.indexOf(60);
		if(num != -1) {
			arr.set(num, 600);
		}
		
		int num1 = arr.indexOf(90);
		if(arr.contains(90)) {
			arr.remove(num1);
		}
		
		System.out.println(arr);
		
	}
}
