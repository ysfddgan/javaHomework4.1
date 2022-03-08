
public class Gamer {
	int id;
	String nickName;
	String userName;
	String password;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String nickName, String userName, String password) {

		this.id = id;
		this.nickName = nickName;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
