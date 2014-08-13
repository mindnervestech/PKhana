package com.pharmakhana.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

import play.db.jpa.JPA;

@Entity
@Table(name="Country")
public class Country {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="country_id")
	private Integer countryId;
	@Column(name="country_code")
	private String countryCode;
	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/*/select distinct a.country_id, country_code from country a, pharmacy_profile b where  b.language_language_id = (select language_id from language where language_code = 'En') and a.country_id = b.country_country_id*/
	public static List<Country> findCountriesByLangCode(final String langCode) {
		
		Query query = JPA.em().createQuery("select distinct a from Country a, PharmacyProfile b where " +
				"b.country.countryId = a.countryId and b.language.languageId = (select c.languageId from Language c where c.languageCode = '" + langCode + "')");
		return (List<Country>) query.getResultList();
	}
	
}
