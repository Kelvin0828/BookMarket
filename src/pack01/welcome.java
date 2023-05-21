package pack01;

import java.util.Scanner;

public class welcome {
	public static void defaultbooklist() // 기본 북 리스트 출력 함수//
	{
		System.out.println("ISBN:978-89-7050-941-9\t Book Name:두근두근 자료구조 ");
		System.out.println("ISBN:978-89-17-23742-9\t Book Name:Global Communication ");
		System.out.println("ISBN:978-89-994-0207-4\t Book Name:교육학개론 ");
		System.out.println("ISBN:978-89-8081-579-1\t Book Name:Digital Design Guide ");
		System.out.println("ISBN:978-0-357-02105-7\t Book Name:Great Writing ");
		System.out.println("ISBN:978-89-7050-521-3\t Book Name:명품 C 언어 프로그래밍 ");
		System.out.println("ISBN:978-89-6542-278-5\t Book Name:해커스 토익 기출 보카 ");
		System.out.println("ISBN:979-11-5664-638-9\t Book Name:JAVA 마스터 ");
		System.out.println("ISBN:0262035618       \t Bookname:Deep Learning");
		System.out.println("ISBN:9791158394271    \t Bookname:파이썬 데이터 사이언스 핸드북");
	}

	public static void main(String[] args) {
		int i = 0; // 책 배열 관련 변수//
		int j = 0; //
		int k = 0; // 장바구니 배열 관련 변수//
		int select; // case 3번에서는 항목 초기화 재확인 용도, case 4번에서 책이름 또는 isbn을 통해 추가할때 쓰는 변수//
		book[] b = new book[100]; // book class 객체 배열 생성, 크기는 100//
		b[i] = new book();
		b[j] = new book();
		cartlist[] c = new cartlist[100]; // cart list class 객체 생성,크기는 100//
		c[k] = new cartlist();
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("로그인 화면입니다");
			System.out.println("");
			System.out.println("Name: ");
			String name = s.nextLine(); // 사용자 정보 중 이름 변수 name//
			System.out.println("Phone Number: ");
			String pnum = s.nextLine();// 사용자 정보 중 전화번호 변수 pnum//
			System.out.println("Adress: ");
			String ad = s.nextLine();// 사용자 정보중 배송지 정보 변수 ad//
			System.out.println("\tHSH 북 스토어에 오신것을 환영합니다");
			boolean quit = false; // 부울린 quit 변수 True 값이 되면 프로그램이 끝남//
			while (!quit) {
				System.out.println("==========================================");
				System.out.println("");
				System.out.println("1. 고객 정보 확인 	\t4.바구니에 항목추가");
				System.out.println("2. 상품 목록 보기 \t\t5.사용자 정보 변경하기");
				System.out.println("3. 장바구니 비우기	 \t6.장바구니의 항목 삭제하기");
				System.out.println("7. 책 등록 요청하기	\t8.종료메뉴");
				System.out.println("9. 등록 요청된 책 확인하기\t10.장바구니 확인하기");
				System.out.println("11.관리자 로그인");
				System.out.println("==========================================");
				System.out.println("원하는 메뉴의 번호를 입력하고 Enter> ");
				int mn = s.nextInt(); // 메뉴 선택 변수 mn//

				if (mn < 1 || mn > 11) {
					System.out.println("올바르지 않은 선택지");
				} else {
					switch (mn) {
						case 1:
							System.out.println("고객 정보 메뉴입니다.");
							System.out.println("");
							System.out.println("Name: " + name + "\tPhone Number: " + pnum);
							System.out.println("Address: " + ad);
							break;

						case 2:
							System.out.println("상품 목록 메뉴입니다.");
							System.out.println("==========================================");
							defaultbooklist();
							break;

						case 3:
							System.out.println("장바구니 비우기 메뉴입니다.");
							System.out.println("정말로 장바구니를 비우시겠습니까? (Y=1/N=0)");
							select = s.nextInt();
							if (select == 1) {
								System.out.println("장바구니의 모든 항목을 삭제합니다");
								for (k = 0; k < 100; k++) {
									c[k] = new cartlist();
									c[k].bname = null; // 모든 cartlist 배열 요소를 Null 값으로 초기화//
									c[k].ISBN = null; // 모든 cartlist 배열 요소를 Null 값으로 초기화//
									c[k].price = 0; // 모든 cartlist 배열 요소를 0으로 초기화//
								}
								k = 0;
							} else if (select == 0) {
								System.out.println("장바구니의 모든 항목 삭제를 중지합니다.");
							}

							else {
								System.out.println("올바르지 않은 명령어");
							}
							break;

						case 4:
							System.out.println("장바구니에 항목 추가하기 메뉴입니다.");
							System.out.println(" ");
							defaultbooklist();
							System.out.println("책 이름을 통해 추가하려면 1, 책의 ISBN을 통해 입력하려면 0 을 입력: ");
							select = s.nextInt();
							s.nextLine();
							if (select == 1) // 책이름을 통해 장바구니 항목추가 책의 정보에는 이름 isbn 금액 3가지가 있음//
							{
								System.out.println("장바구니에 담으려는 책 이름 입력: ");
								String bname01 = s.nextLine();// 책이름을 받는 변수//
								switch (bname01) {
									case "두근두근 자료구조":
										c[k] = new cartlist();
										c[k].bname = "두근두근 자료구조";
										c[k].ISBN = "978-89-7050-941-9";
										c[k].at = "kim01";
										c[k].date = "2019-02-14";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.2;
										c[k].price = 15000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "Global Communication":
										c[k] = new cartlist();
										c[k].bname = "Global Communication";
										c[k].ISBN = "978-89-17-23742-9";
										c[k].at = "Rick";
										c[k].date = "2018-03-17";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 4.5;
										c[k].price = 20000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "교육학개론":
										c[k] = new cartlist();
										c[k].bname = "교육학개론";
										c[k].ISBN = "978-89-994-0207-4";
										c[k].at = "jung";
										c[k].date = "2018-05-22";
										c[k].genre = "Education";
										c[k].type = "B";
										c[k].st = 4.0;
										c[k].price = 17500;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "Digital Design Guide":
										c[k] = new cartlist();
										c[k].bname = "Digital Design Guide";
										c[k].ISBN = "978-89-8081-579-1";
										c[k].at = "chung";
										c[k].date = "2018-04-16";
										c[k].genre = "IT";
										c[k].type = "A";
										c[k].st = 3.8;
										c[k].price = 25000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "Great Writing":
										c[k] = new cartlist();
										c[k].bname = "Great Writing";
										c[k].ISBN = "978-0-357-02105-7";
										c[k].at = "james";
										c[k].date = "2020-08-30";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 4.8;
										c[k].price = 12000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "명품 C 언어 프로그래밍":
										c[k] = new cartlist();
										c[k].bname = "명품 C 언어 프로그래밍";
										c[k].ISBN = "978-89-7050-521-3";
										c[k].at = "Kim02";
										c[k].date = "2020-07-16";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.9;
										c[k].price = 30000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "해커스 토익 기출 보카":
										c[k] = new cartlist();
										c[k].bname = "해커스 토익 기출 보카";
										c[k].ISBN = "978-89-6542-278-5";
										c[k].at = "hong";
										c[k].date = "2021-03-10";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 5.0;
										c[k].price = 9500;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "JAVA 마스터":
										c[k] = new cartlist();
										c[k].bname = "JAVA 마스터";
										c[k].ISBN = "979-11-5664-638-9";
										c[k].at = "Joo";
										c[k].date = "2022-08-10";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.9;
										c[k].price = 20000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "Deep Learning":
										c[k] = new cartlist();
										c[k].bname = "Deep Learning";
										c[k].ISBN = "0262035618";
										c[k].at = "Ian Goodfellow";
										c[k].date = "2018-09-27";
										c[k].genre = "IT,AI,CS";
										c[k].type = "A";
										c[k].st = 5.0;
										c[k].price = 79000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "파이썬 데이터 사이언스 핸드북":
										c[k] = new cartlist();
										c[k].bname = "파이썬 데이터 사이언스 핸드북";
										c[k].ISBN = "9791158394271";
										c[k].at = "Kim04";
										c[k].date = "2018-11-28";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.2;
										c[k].price = 32000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

								}

							} else if (select == 0)// isbn을 통해 장바구니 추가//
							{
								System.out.println("담으려는 책의 ISBN 입력: ");
								String ISBN01;
								ISBN01 = s.nextLine();// isbn입력받는 변수//
								switch (ISBN01) {
									case "978-89-7050-941-9":
										c[k] = new cartlist();
										c[k].bname = "두근두근 자료구조";
										c[k].ISBN = "978-89-7050-941-9";
										c[k].at = "kim01";
										c[k].date = "2019-02-14";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.2;
										c[k].price = 15000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-89-17-23742-9":
										c[k] = new cartlist();
										c[k].bname = "Global Communication";
										c[k].ISBN = "978-89-17-23742-9";
										c[k].at = "Rick";
										c[k].date = "2018-03-17";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 4.5;
										c[k].price = 20000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-89-994-0207-4":
										c[k] = new cartlist();
										c[k].bname = "교육학개론";
										c[k].ISBN = "978-89-994-0207-4";
										c[k].at = "jung";
										c[k].date = "2018-05-22";
										c[k].genre = "Education";
										c[k].type = "B";
										c[k].st = 4.0;
										c[k].price = 17500;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-89-8081-579-1":
										c[k] = new cartlist();
										c[k].bname = "교육학개론";
										c[k].ISBN = "978-89-994-0207-4";
										c[k].at = "jung";
										c[k].date = "2018-05-22";
										c[k].genre = "Education";
										c[k].type = "B";
										c[k].st = 4.0;
										c[k].price = 17500;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-0-357-02105-7":
										c[k] = new cartlist();
										c[k].bname = "Great Writing";
										c[k].ISBN = "978-0-357-02105-7";
										c[k].at = "james";
										c[k].date = "2020-08-30";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 4.8;
										c[k].price = 12000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-89-7050-521-3":
										c[k] = new cartlist();
										c[k].bname = "명품 C 언어 프로그래밍";
										c[k].ISBN = "978-89-7050-521-3";
										c[k].at = "Kim02";
										c[k].date = "2020-07-16";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.9;
										c[k].price = 30000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "978-89-6542-278-5":
										c[k] = new cartlist();
										c[k].bname = "해커스 토익 기출 보카";
										c[k].ISBN = "978-89-6542-278-5";
										c[k].at = "hong";
										c[k].date = "2021-03-10";
										c[k].genre = "English";
										c[k].type = "E";
										c[k].st = 5.0;
										c[k].price = 9500;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "979-11-5664-638-9":
										c[k] = new cartlist();
										c[k].bname = "JAVA 마스터";
										c[k].ISBN = "979-11-5664-638-9";
										c[k].at = "Joo";
										c[k].date = "2022-08-10";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.9;
										c[k].price = 20000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "0262035618":
										c[k] = new cartlist();
										c[k].bname = "Deep Learning";
										c[k].ISBN = "0262035618";
										c[k].at = "Ian Goodfellow";
										c[k].date = "2018-09-27";
										c[k].genre = "IT,AI,CS";
										c[k].type = "A";
										c[k].st = 5.0;
										c[k].price = 79000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

									case "9791158394271":
										c[k] = new cartlist();
										c[k].bname = "파이썬 데이터 사이언스 핸드북";
										c[k].ISBN = "9791158394271";
										c[k].at = "Kim04";
										c[k].date = "2018-11-28";
										c[k].genre = "IT,CS";
										c[k].type = "A";
										c[k].st = 4.2;
										c[k].price = 32000;
										System.out.println((k + 1) + " Book Name:" + c[k].bname + "	\tISBN:" + c[k].ISBN
												+ " \tAuthor:" + c[k].at + " \tRelease Date:" + c[k].date + " \tGenre:"
												+ c[k].genre + " \tType:" + c[k].type + " \tStar:" + c[k].st
												+ " \tPrice:"
												+ c[k].price);
										k = k + 1;
										break;

								}
							}
							break;

						case 5:
							System.out.println("사용자 정보 변경 메뉴입니다.");
							s.nextLine();
							System.out.println("Name: ");
							name = s.nextLine(); // 위의 이름 변수 변경//
							System.out.println("Phone Number: ");
							pnum = s.nextLine();// 위의 전화번호 변수 변경//
							System.out.println("Address: ");
							ad = s.nextLine();// 위의 주소 변수 변경//
							break;

						case 6:
							System.out.println("장바구니의 항목 삭제하기 메뉴입니다.");
							for (int p = 0; p < k; p++)// 0부터 클래스 배열 c의 끝인 k 번째 요소 까지 반복//
							{
								System.out.println((p) + " Book Name:" + c[p].bname + "\tISBN:" + c[p].ISBN + "\tPrice:"
										+ c[p].price + "원");// 현재까지 추가된 항목 세부정보 띄우기//
							}
							System.out.println("");
							System.out.println("삭제할 항목의 인덱스를 입력하세요: ");
							int index = s.nextInt();
							s.nextLine();

							if (index >= 0 && index < k) {
								System.out.println("다음 항목을 장바구니에서 삭제합니다:");
								System.out.println("Book Name: " + c[index].bname + "\tISBN: " + c[index].ISBN);
								for (int m = index; m < k - 1; m++) {
									c[m] = c[m + 1]; // 선택한 인덱스의 항목을 삭제하고 배열을 재정렬//
								}
								c[k - 1] = null; // 마지막 요소를 null로 초기화//
								k--;
								System.out.println("\t   삭제 후 장바구니");
								for (int p = 0; p < k; p++)// 0부터 클래스 배열 c의 끝인 k 번째 요소 까지 반복//
								{
									System.out.println((p + 1) + " Book Name:" + c[p].bname + "	\tISBN:" + c[p].ISBN
											+ " \tAuthor:" + c[p].at + " \tRelease Date:" + c[p].date + " \tGenre:"
											+ c[p].genre + " \tType:" + c[p].type + " \tStar:" + c[p].st + " \tPrice:"
											+ c[p].price);// 현재까지 추가된 항목 세부정보 띄우기//
								}
							} else {
								System.out.println("올바르지 않은 인덱스입니다.");
							}
							break;

						case 7:
							System.out.println("책 등록 요청하기 메뉴입니다.");
							s.nextLine();
							System.out.println("등록할 책 이름: ");
							String bn = s.nextLine(); // 등록할 책이름 받는 변수//
							System.out.println("등록할 책의 ISBN: ");
							String in = s.nextLine(); // 등록할책 isbn 받는 변수//
							b[i] = new book(); // 위에 생성한 book class 객체 b를 이용해 객체 배열 생성//
							b[i].bookname = bn; // 입력 값을 객체 배열 안 멤버로 옮김//
							b[i].isbn = in; // 입력 값을 객체 배열 안 멤버로 옮김//
							i = i + 1; // 객체 배열 b[i]에 추후 등록될 책 공간 생성
							break;

						case 8:
							System.out.println("종료메뉴입니다.");
							quit = true; // 부울린 값을 True 로 바꿔줌으로서 종료//
							break;

						case 9:
							System.out.println("등록 요청된 책 확인하기");
							System.out.println(" ");
							for (j = 0; j < i; j++) // 0부터 객체 배열 b[i]의 끝 i 번째까지 반복//
							{
								System.out.println((j + 1) + ". 책 이름:" + b[j].bookname + "\tISBN:" + b[j].isbn); // 등록
																													// 요청된
																													// 책
																													// 리스트
																													// 보기//
							}
							break;

						case 10:
							System.out.println("장바구니 확인 메뉴입니다");
							int tprice = 0;// 장바구니에있는 모든 항목의 총액을 위한 변수 tprice (total price의 약자)//
							if (k == 0)// k=0 아무것도 없을때//
							{
								System.out.println("");
								System.out.println("장바구니가 비었습니다");
							}
							for (int p = 0; p < k; p++)// 0부터 클래스 배열 c의 끝인 k 번째 요소 까지 반복//
							{
								System.out.println((p + 1) + " Book Name:" + c[p].bname + "	\tISBN:" + c[p].ISBN
										+ " \tAuthor:" + c[p].at + " \tRelease Date:" + c[p].date + " \tGenre:"
										+ c[p].genre
										+ " \tType:" + c[p].type + " \tStar:" + c[p].st + " \tPrice:" + c[p].price);// 현재까지
																													// 추가된
																													// 항목
																													// 세부정보
																													// 띄우기//
								tprice += c[p].price;// tprice 변수에 값 축적//
							}
							System.out.println("");
							System.out.println("Total price:" + tprice + "원"); // 총 결재액 띄우기//
							int point = 0;
							point = tprice / 10;
							System.out.println("");
							System.out.println("지금 구매시 " + point + " 포인트가 추가 됩니다");
							break;

						case 11:
							System.out.println("\t 관리자 로그인");
							System.out.println("");
							System.out.println("등록된 이름을 입력하세요: ");
							s.nextLine();// 오류 처리//
							String adminname = s.nextLine(); // 관리자 이름 입력//
							System.out.println("등록된 전화번호를 입력하세요: ");
							String adminpnum = s.nextLine(); // 관리자 전화번호 입력//

							if (adminname.equals(name) && adminpnum.equals(pnum)) // 등록된 정보와 입력된 정보 대조//
							{
								System.out.println("관리자 로그인 성공!");
							}

							else {
								System.out.println("관리자 로그인 실패!");
							}
							break;

					}
				}
			}
		}
	}
}
