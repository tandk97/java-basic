package 연산자;

public class 네이버로그인 {

	public static void main(String[] args) {
		// 기본형 비교 여러개인 경우
		// 가입했을 때의 id/pw
		// db에 저장되어 있는 값을 db에서 꺼내와야함

		int id = 1111;
		int pw = 2222;
		// 입력한 id/pw
		int id2 = 1111;
		int pw2 = 2222;

		// 논리연산자 &&

		// 조건이 맞을 때, 맞지 않을 때 다르게 처리하고자 하는 경우 if~
		// 문법으로 쓰려고 미리 만들어놓은 단어들(예약어)은 이름으로 사용할 수 없다.
		// if(조건) : 조건은 비교하는 것을 써야함.(true/false)
		if (id == id2 && pw == pw2) { // 기본형은 연산자를 이용해서 값을 비교할 수 있다
			System.out.println("로그인 성공");
		} else { // else()쓰지않는다
			System.out.println("로그인 실패");
		}
	}

}
