package day04;

//문제) data[] ={ "권수진", "최명진", "한경미", "박현진", "서유미"} 
//위의 배열을 오름차순으로 정렬해 보세요
//
//정렬 알고리즘은 상관없습니다

public class 정렬문제 {
	String[] names;

	// 정렬되지 전에 자료 만들어주기(초기화)
	void init() {
		names = new String[] { "권수진", "최명진", "한경미", "박현진", "서유미" };
	}

	// 배열안에 있는 것 출력하기
	void display() {
		for (int n = 0; n < names.length; n++) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 내부정렬-메모리안에 올려두고 정렬하는 것 정렬할 양이 적은 것
		// 외부정렬-정렬할 데이터가 많아서 메모리에 올려 처리하기 힘든 경우 (기본 알고리즘은 내부정렬 알고리즘 도입함)
		// 정렬의 핵심요소는 교환, 선택, 삽입
		// 버블정렬
		정렬문제 s = new 정렬문제();
		System.out.println("----- 버블 정렬하기 전");
		s.init();
		s.display();
		s.bubbleSort1();

		System.out.println("----- 이름 버블 정렬 완료");
		s.display();
	}

	void bubbleSort1() {
		System.out.println(" 버블 정렬 중 ----->");
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < names.length - 1 - i; j++) {
				
				
				if (names[j] > names[j + 1]) {
					String temp = names[j + 1];
					names[j + 1] = names[j];
					names[j] = temp;
				}
			}
			System.out.printf("%3d 회 :", (i + 1));
			display();
		}
		System.out.println();
	}

}