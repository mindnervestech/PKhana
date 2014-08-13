package com.pharmakhana.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Query;
import javax.persistence.Table;

import play.db.jpa.JPA;

@Entity
@Table(name="pre_defined_locations")
public class PreDefinedLocations {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="loc_id")
	private Integer locId;
	@Column(name="location_name")
	private String locationName;
	@ManyToOne(cascade = CascadeType.ALL)
	private Language language;
	@ManyToOne(cascade = CascadeType.ALL)
	private Country country;
	
	/**
	 * @return the locId
	 */
	public Integer getLocId() {
		return locId;
	}
	/**
	 * @param locId the locId to set
	 */
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	/**
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}
	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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
	
	public static List<PreDefinedLocations> findLocationsByCountry(final String langCode, final String countryCode) {
		Query query = JPA.em().createQuery("select distinct a from PreDefinedLocations a where " +
				"a.country.countryId = ( select countryId from Country where country_code = '" + countryCode + "') and a.language.languageId = (select c.languageId from Language c where c.languageCode = '" + langCode + "')");
		
		return (List<PreDefinedLocations>) query.getResultList();
	}
	
}
