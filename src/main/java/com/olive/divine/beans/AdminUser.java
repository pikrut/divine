package com.olive.divine.beans;

/**
 * This class defined Admin user attributes
 */
import java.sql.Timestamp;
public class AdminUser {	
	private Long Id;
	private String name;
	private String userNam;
	private String password;
	private String emailAddress;
	private String phone;
	private int adminUser;
	private int status;
	private String loginIpAddress;
	private Timestamp lastLoginTime;
	private Timestamp laastLogoutTime;
	private Timestamp updateTime;
	private Timestamp createTime;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserNam() {
		return userNam;
	}
	public void setUserNam(String userNam) {
		this.userNam = userNam;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAdminUser() {
		return adminUser;
	}
	public void setAdminUser(int adminUser) {
		this.adminUser = adminUser;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLoginIpAddress() {
		return loginIpAddress;
	}
	public void setLoginIpAddress(String loginIpAddress) {
		this.loginIpAddress = loginIpAddress;
	}
	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Timestamp getLaastLogoutTime() {
		return laastLogoutTime;
	}
	public void setLaastLogoutTime(Timestamp laastLogoutTime) {
		this.laastLogoutTime = laastLogoutTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "AdminUser [Id=" + Id + ", name=" + name + ", userNam=" + userNam + ", password=" + password
				+ ", emailAddress=" + emailAddress + ", phone=" + phone + ", adminUser=" + adminUser + ", status="
				+ status + ", loginIpAddress=" + loginIpAddress + ", lastLoginTime=" + lastLoginTime
				+ ", laastLogoutTime=" + laastLogoutTime + ", updateTime=" + updateTime + ", createTime=" + createTime
				+ "]";
	}
	
}
