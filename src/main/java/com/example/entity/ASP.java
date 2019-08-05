package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "asp_mst")
public class ASP {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "asp_id")
	private int aspId;
	
	@Column(name = "office_name")
	private String officeNname;
	
	@Column(name = "asp_address")
	private String address;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "state_id")
	private int stateId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	private Date createdDate;

	@OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(name = "location", joinColumns = @JoinColumn(name = "asp_id"), inverseJoinColumns = @JoinColumn(name = "area_id"))
	private Area area;

	
	@OneToMany(cascade=CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(name = "user_asp_map", joinColumns = @JoinColumn(name = "asp_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> user;

	public int getStateId() {
		return stateId;
	}


	public void setStateId(int stateId) {
		this.stateId = stateId;
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public List<User> getUser() {
		return user;
	}


	public void setUser(List<User> user) {
		this.user = user;
	}


	public Area getArea() {
		return area;
	}


	public void setArea(Area area) {
		this.area = area;
	}


	public int getAspId() {
		return aspId;
	}


	public void setAspId(int aspId) {
		this.aspId = aspId;
	}


	public String getOfficeNname() {
		return officeNname;
	}


	public void setOfficeNname(String officeNname) {
		this.officeNname = officeNname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
