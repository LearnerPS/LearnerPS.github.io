***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_07;

import java.util.ArrayList;
import java.util.Scanner;

public class TestSchoolManager {
	private static ArrayList<BookVo> books = new ArrayList<BookVo>();
	private static int menuNo = 0;//선택 메뉴 번호	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			메인메뉴();
			menuNo = sc.nextInt();
			sc.nextLine();//숫자읽고 남은 엔터키 읽어 버림
			if(menuNo == -999)
				break;
			else if(menuNo == 1) {
				등록();
			}else if(menuNo == 5) {
				전체출력();
			}else if(menuNo == 2) {
				검색();
			}
		}//end while

	}//end main

	private static void 검색() {
		while (true) {
			System.out.println("*** 검색 ***");
			System.out.println("(1)이름검색  (2)isbn 검색   (-999)메인메뉴");
			System.out.println("검색대상 선택>> ");
			menuNo = sc.nextInt();
			sc.nextLine();//숫자읽고 남은 엔터키 읽어 버림
			if (menuNo == 1) {
				이름검색();
			} else if (menuNo == 2) {
				isbn검색();
			} else if (menuNo == -999) {
				return;
			} else {
				System.out.println("잘못된 번호입니다");
			} 
		}//end while
	}

	private static void isbn검색() {
		System.out.println("검색  isbn 입력>> ");
		String isbn = sc.nextLine();//
		for (BookVo vo : books) {
			if(vo.getIsbn().equals(isbn)) {
				System.out.println("검색성공!");
				System.out.println("제목:"+vo.getTitle());
				System.out.println("출판사:"+vo.getPublisher());
				System.out.println("저자:"+vo.getAuthor());
				System.out.println("가격:"+vo.getPrice());
				return;
			}
		}//end for
		System.out.println("검색결과 없음");
	}

	private static void 이름검색() {
		System.out.println("검색 이름 입력>> ");
		String title = sc.nextLine();//
		for (BookVo vo : books) {
			if(vo.getTitle().equals(title)) {
				System.out.println("검색성공!");
				System.out.println("제목:"+vo.getTitle());
				System.out.println("출판사:"+vo.getPublisher());
				System.out.println("저자:"+vo.getAuthor());
				System.out.println("가격:"+vo.getPrice());
				return;
			}
		}//end for
		System.out.println("검색결과 없음");
	}

	private static void 전체출력() {
		System.out.println("*** 전체출력 ***");
		for (BookVo vo : books) {
			System.out.println(vo.toString());
		}
	}

	private static void 등록() {
		System.out.println("도서 제목 입력>> ");
		String name = sc.nextLine();
		System.out.println("도서 출판사 입력>> ");
		String publish = sc.nextLine();
		System.out.println("도서 저자 입력>> ");
		String writer = sc.nextLine();
		System.out.println("도서 ISBN 입력>> ");
		String isbn = sc.nextLine();
		System.out.println("도서 가격 입력>> ");
		int price = Integer.parseInt(sc.nextLine());
		
		BookVo b = new BookVo(name, publish, writer, isbn, price);
		books.add(b);	
	}

	private static void 메인메뉴() {
		System.out.println("(1)등록 (2)검색 (3)수정 (4)삭제 (5)전체출력 (-999)종료");
		System.out.println("저장갯수: XX개");
		System.out.println("메뉴번호 입력>>");
	}

}//end class

```
