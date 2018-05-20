package com.myteam.client_onboarding_enrichment;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Client implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "ID")
	private long id;
	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Type")
	private java.lang.String type;
	@org.kie.api.definition.type.Label(value = "Business Identifier Code")
	private java.lang.String bic;
	@org.kie.api.definition.type.Label(value = "Address")
	private java.lang.String address;
	@org.kie.api.definition.type.Label(value = "Country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label(value = "Phone Number")
	private java.lang.String phoneNumber;
	@org.kie.api.definition.type.Label(value = "Credit Score")
	private int creditScore;

	public Client() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getBic() {
		return this.bic;
	}

	public void setBic(java.lang.String bic) {
		this.bic = bic;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(java.lang.String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public Client(long id, java.lang.String name, java.lang.String type,
			java.lang.String bic, java.lang.String address,
			java.lang.String country, java.lang.String phoneNumber,
			int creditScore) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.bic = bic;
		this.address = address;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.creditScore = creditScore;
	}

}