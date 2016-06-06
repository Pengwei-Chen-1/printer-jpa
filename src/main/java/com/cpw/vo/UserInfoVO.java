package com.cpw.vo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

/**
 * 用户信息表
 * 
 * @author epeicen
 *
 */
@SuppressWarnings("deprecation")
@Entity
@Table(name = "userinfo")
public class UserInfoVO {

	@Id
	@GeneratedValue
	private int userId;
	
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
