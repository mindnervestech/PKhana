package com.pharmakhana.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pharmacy_profile")
public class PharmacyProfile {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="profile_id")
	private Integer profileId;
	private String name;
	private String address;
	private String city;
	@ManyToOne(cascade = CascadeType.ALL)
	private Country country;
	@ManyToOne(cascade = CascadeType.ALL)
	private Language language;
	@ManyToOne(cascade = CascadeType.ALL)
	private Location location;
	@ManyToOne(cascade = CascadeType.ALL)
	private PreDefinedLocations predefinedLoc;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contacts> contacts;

	/**
	 * @return the profileId
	 */
	public Integer getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the predefinedLoc
	 */
	public PreDefinedLocations getPredefinedLoc() {
		return predefinedLoc;
	}

	/**
	 * @param predefinedLoc the predefinedLoc to set
	 */
	public void setPredefinedLoc(PreDefinedLocations predefinedLoc) {
		this.predefinedLoc = predefinedLoc;
	}

	/**
	 * @return the contacts
	 */
	public List<Contacts> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts the contacts to set
	 */
	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}
	
}
