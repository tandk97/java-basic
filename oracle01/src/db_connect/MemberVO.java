package db_connect;

public class MemberVO {
	// 가방에는 데이터를 넣을 공간이 필요하다
	// 회원테이블은 4개의 항목을 가지고 있음
	//

	private String id;
	private String pw;
	private String name;
	private String tel;

	// 값을 넣은 메서드(set변수명(넣을 값))
	public void setId(String id) { // "hong"
		this.id = id;
	}

	// 값을 꺼내는 메서드(get변수명())
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

}