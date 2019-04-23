package cn.tedu.demo.entity;

import java.io.Serializable;
/**
 * 用户的实体类
 */
public class User implements Serializable{

	private static final long serialVersionUID = 370030031553419808L;
	
	private Integer uid;
	private String username;
	private String password;
	private String salt;
	
	public User() {
		super();
	}

	public User(Integer uid, String username, String password, String salt) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.salt = salt;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", salt=" + salt + "]";
	}
	
	
	
}
