package day03;

//����Ͻ� Ŭ���� 
public class ��¥����ϱ�1 {

	public static void main(String[] args) {
		// 2022�� 10�� 14���� 2022�� 1�� 1�� ����°���� ����ϴ� ���α׷� �ۼ��ϱ�
		//1. 1�� + ... +9�� + 14 =
		//2. 2�� ���� 29��
		
		DayOfYear dy =  new DayOfYear();
		System.out.println("���� 1�� 1�Ϻ����� ��¥�� " + dy.calc(2022, 2, 1));

	}

}
//��¥ ����ϴ� Ŭ����
class DayOfYear{

	public int calc(int year, int month, int day) {
		//1. 1�� ~ 9������ ���������� �����ؼ� ���Ѵ�.
		int[] lastday = {0, 31, 28, 31, 30, 31,30,31,31,30,31,30, 31 };
		//2. �������� �Ǵ��ϱ�
		if(isLeap(year)) lastday[2] = 29;
		int result = 0; //���� ����
		for(int i=1; i < month ; i++) {
			result += lastday[i];
		}
		result += day;
		return result;
	}
	//������ ����ϴ� �޼ҵ� 
	private boolean isLeap(int year) {
		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) return true;
		return false; 
	}
}