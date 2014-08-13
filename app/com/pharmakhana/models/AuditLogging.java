package com.pharmakhana.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.JPA;

@Entity
@Table(name="Audit_Logging")
public class AuditLogging {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="log_id")
	private Integer logId;
	@Column(name="unique_id")
	private String uniqueId;
	@Column(name="log_parameters")
	private String logParameters;
	@Column(name="log_type")
	private String logType;
	@Column(name="log_message")
	private String logMessage;
	@Column(name="logdatetimestamp")
	private Timestamp logDateTime;
	
	/**
	 * @return the logId
	 */
	public Integer getLogId() {
		return logId;
	}
	/**
	 * @param logId the logId to set
	 */
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}
	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	/**
	 * @return the logParameters
	 */
	public String getLogParameters() {
		return logParameters;
	}
	/**
	 * @param logParameters the logParameters to set
	 */
	public void setLogParameters(String logParameters) {
		this.logParameters = logParameters;
	}
	/**
	 * @return the logType
	 */
	public String getLogType() {
		return logType;
	}
	/**
	 * @param logType the logType to set
	 */
	public void setLogType(String logType) {
		this.logType = logType;
	}
	/**
	 * @return the logMessage
	 */
	public String getLogMessage() {
		return logMessage;
	}
	/**
	 * @param logMessage the logMessage to set
	 */
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	/**
	 * @return the logDateTime
	 */
	public Timestamp getLogDateTime() {
		return logDateTime;
	}
	/**
	 * @param logDateTime the logDateTime to set
	 */
	public void setLogDateTime(Timestamp logDateTime) {
		this.logDateTime = logDateTime;
	}
	
	public void save() {
		System.out.println("incoming data... " + this.logMessage);
		JPA.em().persist(this);
	}
}
