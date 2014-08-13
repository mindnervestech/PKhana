package com.pharmakhana.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pharmacy")
public class Pharmacy {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pharmacy_id")
	private Integer pharmacyId;
	@Column(name="pharmacy_logo")
	private String pharmacyLogo;
	@Column(name="appeared_in_search")
	private Long appearedInSearch;
	@Column(name="contact_by_count")
	private Long contactedByCount;
	@Column(name="profile_view_count")
	private Long profileViewCount;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Insurances> insurances;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Service> services;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<PharmacyProfile> profiles;
	/**
	 * @return the pharmacyId
	 */
	public Integer getPharmacyId() {
		return pharmacyId;
	}
	/**
	 * @param pharmacyId the pharmacyId to set
	 */
	public void setPharmacyId(Integer pharmacyId) {
		this.pharmacyId = pharmacyId;
	}
	/**
	 * @return the pharmacyLogo
	 */
	public String getPharmacyLogo() {
		return pharmacyLogo;
	}
	/**
	 * @param pharmacyLogo the pharmacyLogo to set
	 */
	public void setPharmacyLogo(String pharmacyLogo) {
		this.pharmacyLogo = pharmacyLogo;
	}
	/**
	 * @return the appearedInSearch
	 */
	public Long getAppearedInSearch() {
		return appearedInSearch;
	}
	/**
	 * @param appearedInSearch the appearedInSearch to set
	 */
	public void setAppearedInSearch(Long appearedInSearch) {
		this.appearedInSearch = appearedInSearch;
	}
	
	/**
	 * @return the contactedByCount
	 */
	public Long getContactedByCount() {
		return contactedByCount;
	}
	/**
	 * @param contactedByCount the contactedByCount to set
	 */
	public void setContactedByCount(Long contactedByCount) {
		this.contactedByCount = contactedByCount;
	}
	/**
	 * @return the profileViewCount
	 */
	public Long getProfileViewCount() {
		return profileViewCount;
	}
	/**
	 * @param profileViewCount the profileViewCount to set
	 */
	public void setProfileViewCount(Long profileViewCount) {
		this.profileViewCount = profileViewCount;
	}
	/**
	 * @return the insurances
	 */
	public List<Insurances> getInsurances() {
		return insurances;
	}
	/**
	 * @param insurances the insurances to set
	 */
	public void setInsurances(List<Insurances> insurances) {
		this.insurances = insurances;
	}
	/**
	 * @return the services
	 */
	public List<Service> getServices() {
		return services;
	}
	/**
	 * @param services the services to set
	 */
	public void setServices(List<Service> services) {
		this.services = services;
	}
	/**
	 * @return the profiles
	 */
	public List<PharmacyProfile> getProfiles() {
		return profiles;
	}
	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(List<PharmacyProfile> profiles) {
		this.profiles = profiles;
	}

}
