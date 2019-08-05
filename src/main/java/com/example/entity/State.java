package com.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "state_mst")
public class State {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "state_id")
	 private int stateId;

	 @Column(name = "state_code")
	 private String stateCode;
	 
	 @Column(name = "state_name")
	 private String stateName;
	 
	 @Column(name = "active")
	 private boolean active;
	 
	 @Temporal(TemporalType.TIMESTAMP)
	 @Column(name = "created_date")
	 public Date createdDate;
	 
	 @Column(name = "created_by")
	 private String createdBy;
	 
	 @OneToMany(mappedBy = "state", cascade = {CascadeType.ALL})
	 private List<City> city;

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	 
	 
}
