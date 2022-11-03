package project1;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String date;
	private String tel;
	private String mr;
	private int tm;
	private String loan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMr() {
		return mr;
	}

	public void setMr(String mr) {
		this.mr = mr;
	}

	public int getTm() {
		return tm;
	}

	public void setTm(int tm) {
		this.tm = tm;
	}

	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "회원 정보 : [id=" + id + ", pw=" + pw + ", name=" + name + ", date=" + date + ", tel=" + tel + ", mr=" + mr
				+ ", tm=" + tm + ", loan=" + loan + "]";
	}

}
