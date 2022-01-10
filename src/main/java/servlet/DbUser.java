package servlet;

public class DbUser {
	
	private String uid;
	
	private String loginname;
	
	private String loginpass;
	

	public DbUser(String uid, String loginname, String loginpass) {
		super();
		this.uid = uid;
		this.loginname = loginname;
		this.loginpass = loginpass;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpass() {
		return loginpass;
	}

	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}
}
