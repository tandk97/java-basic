package day01;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 문1) 
		 1차원 배열에 데이터 입력하고 출력하기
		 100 200 300 400... 1000 넣어서 출력하기 */ 
		 int[] a = new int[10];
		 for(int i=0; i<a.length; i++) {
			 a[i] = 100 * i + 100;
		 }
		 for( int i=0;i<a.length; i++) {
			 System.out.print("a[" + i + "]="  + a[i] + " ");
		 }
		 //향상된 for문으로 출력하기
		 for( int n  : a ) {
			 System.out.print(n + "이곳을 찍어 보자!! \t" );
		 }
		 System.out.println();
		
		/*문2) 2차원 배열에 데이터 입력하고 출력하기 */
		System.out.println("-----------문제2번 "); 
		int[][] b = new int[2][3];
		int number=100;
		int[] sum = new int[2];
		
		for(int i=0 ; i<b.length; i++) {
			for(int j=0; j< b[i].length; j++) {
				b[i][j] = number;
				sum[i] += b[i][j]; 
				number-=5;
			}
		}
	
		for(int i=0 ; i<b.length; i++) {
			for(int j=0; j< b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.print(sum[i]);
			System.out.println();
		}
		System.out.println("---------------");
		for(int[] bb : b) {
			for(int bbb : bb) {
				System.out.print( bbb + "\t");
			}
			System.out.println();
		}
		
		/* 문3) 3차원 배열에 데이터 입력하고 출력하기
		 * 배열의 초기값 넣는 방식으로 배열을 만드세요	 */
		
		String[][][] c = { { {"a","b"}, {"c", "d"}, {"e", "f"} }, 
				           { {"f","g"}, {"h", "i"}, {"j", "k"} } 
		                 };
		
		//for문 첨자문을 이용해서 찍기
		//면의 갯수 찍기, 행의 갯수 찍기, 열의 갯수 찍기
		System.out.println("면의 갯수 " + c.length);
		System.out.println("행의 갯수 " + c[0].length);
		System.out.println("열의 갯수 " + c[0][0].length);
		
		for(int i=0; i< c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				for(int k=0; k<c[i][j].length; k++) {
					System.out.print( c[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		//향상된 for문으로 찍기
		
		for(String[][] cc : c) {
			for(String[] ccc : cc) {
				for(String cccc : ccc  ) {
					System.out.print(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
        
	}

}
