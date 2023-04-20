package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> pNum = new ArrayList<>();
		String nameCheck = null;
		String pNumCheck = null;
		int i = 0;
		while(true) {
			try {
				System.out.println("1.연락처 등록");
				System.out.println("2.연락처 보기");
				System.out.println("3.연락처 삭제");
				System.out.println("4.모든 연락처 보기");
				System.out.println("5.연락처 수정");
				System.out.println("6.종료");
				System.out.print(">>>");
				num = input.nextInt();
			}catch(Exception e){
				System.out.println("다시입력해주세요");
				input.nextLine();
			}
			switch(num) {
			case 1 : System.out.println("연락처 등록");
					 System.out.print("이름 : ");
					 nameCheck = input.next();
					 System.out.print("전화번호(-제외) : ");
					 pNumCheck = input.next();
					 for(i = 0; i < name.size(); i++) {
						 if(nameCheck.equals(name.get(i))) {
							 System.out.println("동일한 이름이 존재합니다.");
							 break;
						 }
						 if(pNumCheck.equals(pNum.get(i))) {
							 System.out.println("동일한 전화번호가 존재합니다.");
							 break;
						 }
					 }
					 if(name.size() == 0 || i == name.size()) {
						 name.add(nameCheck);
						 pNum.add(pNumCheck);
						 System.out.println("등록되었습니다.");
						 
					 }
					 break;
					 
			case 2 : System.out.print("확인하실 분의 이름을 입력해주세요 : ");
					 nameCheck = input.next();
					 for(i = 0; i < name.size(); i++) {
						 if(nameCheck.equals(name.get(i))) {
							 System.out.println(name.get(i) + "님의 연락처는 " + pNum.get(i) + "입니다");
							 break;
						 }
					 }
					 if(i == name.size()) {
						 System.out.println("해당하는 이름이 존재하지 않습니다.");
					 }
					 break;
			case 3 : System.out.print("삭제하실 분의 이름을 입력해주세요 : ");
					 nameCheck = input.next();
					 for(i = 0; i < name.size(); i++) {
						 if(nameCheck.equals(name.get(i))) {
							 name.remove(i);
							 pNum.remove(i);
							 System.out.println("삭제되었습니다.");
							 i++;
							 break;
						 }
					 }
					 if(i == name.size()) {
						 System.out.println("해당하는 연락처가 존재하지 않습니다.");
					 }
					 break;
			case 4 : if(name.size() == 0) {
						 System.out.println("연락처가 존재하지 않습니다.");
						 break;
					 }
					 System.out.println("연락처 목록");
					 for(i = 0; i < name.size(); i++) {
						 System.out.println((i+1) + ".이름 : " + name.get(i) + " 연락처 : " + pNum.get(i));
					 }
					 break;
			case 5 : System.out.print("연락처 수정할 분의 이름을 입력하세요 : ");
					 nameCheck = input.next();
					 for(i = 0; i < name.size(); i++) {
						 if(nameCheck.equals(name.get(i))) {
							 System.out.print("수정할 연락처를 입력하세요 : ");
							 pNumCheck = input.next();
							 pNum.set(i, pNumCheck);
							 System.out.println("수정되었습니다.");
							 break;
						 }
					 }
					 if(i == name.size()) {
						 System.out.println("해당하는 연락처가 존재하지 않습니다.");
					 }
					 break;
			case 6 : 
				System.out.println("종료합니다.");
				System.exit(1);
			
			}
			System.out.println("===============================");
		}
	}
}
