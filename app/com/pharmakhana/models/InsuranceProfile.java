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
@Table(name="insurance_profile")
public class InsuranceProfile {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="insprofile_id")
	private Integer insProfileId;
	@Column(name="insurance_prog")
	private String insuranceProgram;
	@ManyToOne(cascade = CascadeType.ALL)
	private Language language;
	@ManyToOne(cascade = CascadeType.ALL)
	private Country country;
	/**
	 * @return the insProfileId
	 */
	public Integer getInsProfileId() {
		return insProfileId;
	}
	/**
	 * @param insProfileId the insProfileId to set
	 */
	public void setInsProfileId(Integer insProfileId) {
		this.insProfileId = insProfileId;
	}
	/**
	 * @return the insuranceProgram
	 */
	public String getInsuranceProgram() {
		return insuranceProgram;
	}
	/**
	 * @param insuranceProgram the insuranceProgram to set
	 */
	public void setInsuranceProgram(String insuranceProgram) {
		this.insuranceProgram = insuranceProgram;
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
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	
}
