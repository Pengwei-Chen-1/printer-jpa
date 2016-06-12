package com.cpw.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户信息表
 * 
 * @author epeicen
 *
 */
@Entity
@Table(name = "userinfo")
public class UserInfoVO {

	@Id
	@GeneratedValue
	@Column(name = "USERID")
	private int userId;

	@Column(name = "USERNAME")
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
