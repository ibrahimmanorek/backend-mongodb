package com.ibrahim.backendmongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customers")
public class Customer {

	@Id
	private ObjectId _id;
	private String customerId;
	private String billingAddress;
	private String city;
	private String companyName;
	private String companyWebsite;
	private String email;
	private String faxNumber;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String shipAddress;
	private String shipCity;
	private String shipPhoneNumber;
	private String shipStateOrProvince;
	private String shipZIPCode;
	private String stateOrProvince;
	private String zipCode;
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}
	public String getShipPhoneNumber() {
		return shipPhoneNumber;
	}
	public void setShipPhoneNumber(String shipPhoneNumber) {
		this.shipPhoneNumber = shipPhoneNumber;
	}
	public String getShipStateOrProvince() {
		return shipStateOrProvince;
	}
	public void setShipStateOrProvince(String shipStateOrProvince) {
		this.shipStateOrProvince = shipStateOrProvince;
	}
	public String getShipZIPCode() {
		return shipZIPCode;
	}
	public void setShipZIPCode(String shipZIPCode) {
		this.shipZIPCode = shipZIPCode;
	}
	public String getStateOrProvince() {
		return stateOrProvince;
	}
	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}