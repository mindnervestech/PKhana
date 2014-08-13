package com.pharmakhana.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contacts {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contact_id")
	private Integer contactId;
	@Column(name="contact_type")
	private String contactType;
	@Column(name="contact")
	private String contact;
	/**
	 * @return the contactId
	 */
	public Integer getContactId() {
		return contactId;
	}
	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	/**
	 * @return the contactType
	 */
	public String getContactType() {
		return contactType;
	}
	/**
	 * @param contactType the contactType to set
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
