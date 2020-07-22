package com.steer.careers.user.dto;

public class LoginDTO {
	private String email;
	private String pwd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", pwd=" + pwd + "]";
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
