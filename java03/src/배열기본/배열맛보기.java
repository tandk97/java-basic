package 배열기본;

public class 배열맛보기 {

	public static void main(String[] args) {
		int[] 정답 = {1,1,2,3};
		// int[] : int 데이터가 무더기로 저장된 위치(주소)
		// 정답 : 주소가 저장됨
		// {1,1,2,3} : 무더기 영여게 저장된 정수 데이터들
		System.out.println(정답);
		
		int[] 내답 = {1,2,4,3}; // A 
		// 무더기에 저장될 데이터를 처음에 모르고 있다가 나중에 넣을 수도 있음
		int[] 공간들 = new int[1000]; //B
		
		// 1. double 배열
		// height 123.4 234.2 124.5 A-type
		// 2. double 배열
		// 500개의 저장공간 B-type
		// 3. char 배열
		// gender '남', '여', '남' A-type
		// 4. String 배열
		// 값을 모름. 333개의 저장공간 B-type
	}

}
