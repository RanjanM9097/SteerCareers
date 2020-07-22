
package com.steer.careers.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class UserRole {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private long roleId;
	private String urole;
	
	public long getUser_roleId() {
		return roleId;
	}
	public void setUser_roleId(long user_roleId) {
		this.roleId = user_roleId;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	@Override
	public String toString() {
		return "UserRole [user_roleId=" + roleId + ", urole=" + urole + "]";
	}
	
	
}
