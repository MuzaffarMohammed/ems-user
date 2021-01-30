package com.appseonit.ems.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * The persistent class for the ems_user database table.
 * 
 */
@Entity
@Table(name="ems_user",
uniqueConstraints={
	    @UniqueConstraint(columnNames = {"USER_NAME"})
	})
public class EmsUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;
	
	@Column(name = "USER_NAME", nullable = false)
	private String userName;
	
	@Column(name = "INSTITUTE_ID", nullable = false)
	private Integer InstituteId;
	
	@Column(name = "EMAIL_ID", nullable = false)
	private String emailId;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getInstituteId() {
		return InstituteId;
	}

	public void setInstituteId(Integer instituteId) {
		InstituteId = instituteId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
