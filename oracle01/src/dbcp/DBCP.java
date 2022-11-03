package dbcp;

public class DBCP {
	// 내(DBCP)가 하나만 만들어서 내가 필요한 클래스에 주기
	static DBCP instance = new DBCP();
	// 객체 생성할 때 클래스 이름과 동일한 생성자를 호출하게 되있음
	// 생성자 메서드를 private로 생성하여 외부에서 객체를 여러개 만들지 못하도록 막아버리기
	private DBCP() {

	}

	// 내가 만들어놓은 객체를 외부에 주는 메서드 하나
	// public을 만들어 주자
	public static DBCP getInstance() {
		if (instance == null) {
			new DBCP();
		}
		return instance;
	}

}
