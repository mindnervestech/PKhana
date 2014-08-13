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
@Table(name="Service")
public class Service {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="service_id")
	private int serviceId;
	@Column(name="service_code")
	private String serviceCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ServiceDetail> profiles;
	
	/**
	 * @return the serviceId
	 */
	public int getServiceId() {
		return serviceId;
	}
	/**
	 * @param serviceId the serviceId to set
	 */
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		return serviceCode;
	}
	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	/**
	 * @return the profiles
	 */
	public List<ServiceDetail> getProfiles() {
		return profiles;
	}
	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(List<ServiceDetail> profiles) {
		this.profiles = profiles;
	}

	
}
