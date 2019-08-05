package com.example.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name = "user_mst")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "user_id")
	 private int userId;
	 
	 @Column(name = "login_id")
	 private String loginId;
	 
	 @Column(name = "first_name")
	 private String firstName;
	 
	 @Column(name = "last_name")
	 private String lastName;
	 
	 @Column(name = "email_id")
	 private String emailId;
	 
	 @Column(name = "mobile_no")
	 private String mobileNo;
	 
	 @Column(name = "IMEI_NO")
	 private String ImeiNo;
	 
	 @Column(name = "alternative_mobile_no")
	 private String alternative_mobile_no;
	 
	 @Column(name = "password")
	 private String password;
	 
	 @Column(name = "active")
	 private boolean active;
	 
	 @Column(name = "skill")
	 private String skill;
	 
	 @Column(name = "mobile_otp")
	 private String mobileOtp;
	 
	 @Column(name = "email_otp")
	 private String emailOtp;
	 
	 @Column(name = "device_info")
	 private String deviceInfo;
	 
	 @Column(name = "profile_image")
	 private String profileImage;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "last_login_time")
	 public Date lastLoginTime;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "created_date")
	 public Date createdDate;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "updated_date")
	 public Date updatedDate;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "password_last_change")
	 public Date passwordLastChange;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "password_exp_date")
	 public Date passwordExpDate;
	 
	 @Column(name = "created_by")
	 private String createdBy;
	 
	 @Column(name = "updated_by")
	 private String updatedBy;
	 
	 @OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	 @JoinTable(name = "user_role_mapping", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	 private List<Role> roles;
	 
	 
	 @OneToMany(cascade = CascadeType.MERGE)
	 @JoinTable(name = "user_asp_map", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "asp_id"))
	 private List<ASP> asps;

	public List<ASP> getAsps() {
		return asps;
	}

	public void setAsps(List<ASP> asps) {
		this.asps = asps;
	}

	public User() {
		
	}
	 
	public User(User users) {
			// TODO Auto-generated constructor stub
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getImeiNo() {
		return ImeiNo;
	}

	public void setImeiNo(String imeiNo) {
		ImeiNo = imeiNo;
	}

	public String getAlternative_mobile_no() {
		return alternative_mobile_no;
	}

	public void setAlternative_mobile_no(String alternative_mobile_no) {
		this.alternative_mobile_no = alternative_mobile_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getMobileOtp() {
		return mobileOtp;
	}

	public void setMobileOtp(String mobileOtp) {
		this.mobileOtp = mobileOtp;
	}

	public String getEmailOtp() {
		return emailOtp;
	}

	public void setEmailOtp(String emailOtp) {
		this.emailOtp = emailOtp;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getPasswordLastChange() {
		return passwordLastChange;
	}

	public void setPasswordLastChange(Date passwordLastChange) {
		this.passwordLastChange = passwordLastChange;
	}

	public Date getPasswordExpDate() {
		return passwordExpDate;
	}

	public void setPasswordExpDate(Date passwordExpDate) {
		this.passwordExpDate = passwordExpDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	 
}
