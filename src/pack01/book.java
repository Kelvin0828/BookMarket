package pack01;

public class book {
	String bookname; // 등록 요청할 책이름 멤버 변수//
	String isbn; // 등록 요청할 책의 ISBN 멤버 변수//

	void insert(String parm1, String parm2) // 등록 요청된 책 변수에 대한 함수//
	{
		bookname = parm1;
		isbn = parm2;
	}
}
