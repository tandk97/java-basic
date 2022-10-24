package day01;

import javax.swing.JOptionPane;

public class 배열문제 {

	public static void main(String[] args) {
		// 2차원 배열
		String[][] a = new String[10][2];
		a[0][0] = "학번";
		a[0][1] = "이름";
		a[1][0] = "0397134";
		a[1][1] = "김효진";
		a[2][0] = "0465345";
		a[2][1] = "이종협";
		a[3][0] = "0427214";
		a[3][1] = "서상춘";
		a[4][0] = "0487342";
		a[4][1] = "배영미";
		a[5][0] = "0512478";
		a[5][1] = "김예진";

		// 데이터를 넣어줄 인덱스 찾기
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i][0] == null) {
				break;
			} // if
		} // for

		// 1. 학번과 이름 입력해서 넣어주기
		a[i][0] = JOptionPane.showInputDialog("학번 입력");
		a[i][1] = JOptionPane.showInputDialog("이름 입력");

		// 2. 배영미 삭제
		// 배영미 찾아서 그 값을 null로 바꾸기
		String deletename = "배영미";
		int k = 0;
		for (; k < a.length; k++) {
			if (a[k][1].equals(deletename)) {
				break;
			} // if
		} // for
		System.out.println("배영미 인덱스 " + k);
		a[k][0] = null;
		a[k][1] = null;

		// 3. 김예진 찾기
		// 여기에 있으면 학번과 이름을 출력해 주고 아니면 우리 반이 아니라고 알려주기
		String searchname = "김예진";
		int n = 0;
		int find = 0;
		try {
			for (; n < a.length; n++) {
				if (a[n][1].equals(searchname)) {
					find = 1;
					break;
				} // if
			} // for
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "우리반이 아닙니다");
		}
		System.out.println("서치 인덱스 " + n);
		if(find==1) {
			JOptionPane.showMessageDialog(null, "학번 : " + a[n][0] + " 이름 : " + a[n][1]);
		}

		// 배열 출력
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[i].length; y++) {
				System.out.print(a[x][y] + "\t");
			} // for
			System.out.println();
		} // for

		// 4. 학번 순으로 찾아서 다른 배열에 넣기
		String[][] so = new String[5][2];
		int hakbun = Integer.parseInt(a[0][0]);
		int minhakbunIndex = 0;
		int minhakbun = hakbun;
		int soindex = 0;
		for (int z = 0; z < a.length; z++) {
			if (minhakbun > Integer.parseInt(a[z][0])) {
				minhakbun = Integer.parseInt(a[z][0]);
				minhakbunIndex = z;
			} // if
		} // for
		System.out.println(minhakbun + " " + minhakbunIndex);
		so[soindex][0] = String.valueOf(minhakbun);
		so[soindex][1] = a[minhakbunIndex][1];
		System.out.println(so[soindex][0] + " " + so[soindex][1]);
		a[minhakbunIndex][0] = "99999999";
		soindex++;

	}// public static void

}// class
