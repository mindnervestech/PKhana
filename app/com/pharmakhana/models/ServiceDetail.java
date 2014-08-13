package com.pharmakhana.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_detail")
public class ServiceDetail {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="servicedesc_id")
	private Integer serProfileId;
	@Column(name="service_name")
	private String serviceName;
	@Column(name="service_desc")
	private String serviceDesc;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Language language;

	/**
	 * @return the serProfileId
	 */
	public Integer getSerProfileId() {
		return serProfileId;
	}

	/**
	 * @param serProfileId the serProfileId to set
	 */
	public void setSerProfileId(Integer serProfileId) {
		this.serProfileId = serProfileId;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceDesc
	 */
	public String getServiceDesc() {
		return serviceDesc;
	}

	/**
	 * @param serviceDesc the serviceDesc to set
	 */
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
