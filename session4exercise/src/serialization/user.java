package serialization;

import java.io.Serializable;

public class user implements Serializable {

	private static final long serialVersionUID = 1096346950678941192L;
	private String username;
	private transient String password;
	private transient String cardnumber;
	public user(String username, String password, String carnumber) {
		super();
		this.username = username;
		this.password = password;
		this.cardnumber = carnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCarnumber() {
		return cardnumber;
	}
	public void setCarnumber(String carnumber) {
		this.cardnumber = carnumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", password=" + password + ", cardnumber=" + cardnumber + "]";
	}
	
	

}
