package com.pharmakhana.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="insurance")
public class Insurances {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="insurance_id")
	private Integer insuranceId;
	@OneToMany(cascade = CascadeType.ALL)
	private List<InsuranceProfile> profiles;
	/**
	 * @return the insuranceId
	 */
	public Integer getInsuranceId() {
		return insuranceId;
	}
	/**
	 * @param insuranceId the insuranceId to set
	 */
	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}
	/**
	 * @return the profiles
	 *//*
	public List<InsuranceProfile> getProfiles() {
		return profiles;
	}
	*//**
	 * @param profiles the profiles to set
	 *//*
	public void setProfiles(List<InsuranceProfile> profiles) {
		this.profiles = profiles;
	}*/
	
	
}
