package day01;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* ��1) 
		 1���� �迭�� ������ �Է��ϰ� ����ϱ�
		 100 200 300 400... 1000 �־ ����ϱ� */ 
		 int[] a = new int[10];
		 for(int i=0; i<a.length; i++) {
			 a[i] = 100 * i + 100;
		 }
		 for( int i=0;i<a.length; i++) {
			 System.out.print("a[" + i + "]="  + a[i] + " ");
		 }
		 //���� for������ ����ϱ�
		 for( int n  : a ) {
			 System.out.print(n + "�̰��� ��� ����!! \t" );
		 }
		 System.out.println();
		
		/*��2) 2���� �迭�� ������ �Է��ϰ� ����ϱ� */
		System.out.println("-----------����2�� "); 
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
		
		/* ��3) 3���� �迭�� ������ �Է��ϰ� ����ϱ�
		 * �迭�� �ʱⰪ �ִ� ������� �迭�� ���弼��	 */
		
		String[][][] c = { { {"a","b"}, {"c", "d"}, {"e", "f"} }, 
				           { {"f","g"}, {"h", "i"}, {"j", "k"} } 
		                 };
		
		//for�� ÷�ڹ��� �̿��ؼ� ���
		//���� ���� ���, ���� ���� ���, ���� ���� ���
		System.out.println("���� ���� " + c.length);
		System.out.println("���� ���� " + c[0].length);
		System.out.println("���� ���� " + c[0][0].length);
		
		for(int i=0; i< c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				for(int k=0; k<c[i][j].length; k++) {
					System.out.print( c[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		//���� for������ ���
		
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
