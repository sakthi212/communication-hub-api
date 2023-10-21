package com.hackathon.springboot.cruddemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CommsHub {

	@Id
	@Column(name = "comms_hub_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Customer_Id")
	private String customerId;

	private String firstName;
	private String lastName;
	private String persona;
	private String coverageName;
	private String effectiveDate;
	private String lineOfBusiness;
	private String channelType;
	private String communicationType;
	private String communicationDirection;
	private String communicationDate;
	private String communicationDescription;
	private String communicationLink;
	private String sourceSystem;
	private String sentiment;
	private String sentimentRunDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getCoverageName() {
		return coverageName;
	}

	public void setCoverageName(String coverageName) {
		this.coverageName = coverageName;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(String communicationType) {
		this.communicationType = communicationType;
	}

	public String getCommunicationDirection() {
		return communicationDirection;
	}

	public void setCommunicationDirection(String communicationDirection) {
		this.communicationDirection = communicationDirection;
	}

	public String getCommunicationDate() {
		return communicationDate;
	}

	public void setCommunicationDate(String communicationDate) {
		this.communicationDate = communicationDate;
	}

	public String getCommunicationDescription() {
		return communicationDescription;
	}

	public void setCommunicationDescription(String communicationDescription) {
		this.communicationDescription = communicationDescription;
	}

	public String getCommunicationLink() {
		return communicationLink;
	}

	public void setCommunicationLink(String communicationLink) {
		this.communicationLink = communicationLink;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public String getSentimentRunDate() {
		return sentimentRunDate;
	}

	public void setSentimentRunDate(String sentimentRunDate) {
		this.sentimentRunDate = sentimentRunDate;
	}

}
