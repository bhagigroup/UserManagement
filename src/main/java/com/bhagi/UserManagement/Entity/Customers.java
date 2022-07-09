package com.bhagi.UserManagement.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customers")
@NamedQuery(name="Customers.findAll", query="SELECT c FROM Customers c")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="customerNumber")
	private Integer customerNumber;
	@Column(name="customerName")
	private String customerName;
	@Column(name="contactLastName")
	private String contactLastName;
	@Column(name="contactFirstName")
	private String contactFirstName;
	@Column(name="phone")
	private String phone;
	@Column(name="addressLine1")
	private String addressLine1;
	@Column(name="addressLine2")
	private String addressLine2;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="postalCode")
	private String postalCode;
	@Column(name="country")
	private String country;
	@Column(name="salesRepEmployeeNumber")
	private Long salesRepEmployeeNumber;
	@Column(name="creditLimit")
	private Double creditLimit;
	
	public Customers() {
		super();
	}
	
	public Customers(Integer customerNumber) {
		super();
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the customerNumber
	 */
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the contactLastName
	 */
	public String getContactLastName() {
		return contactLastName;
	}
	/**
	 * @param contactLastName the contactLastName to set
	 */
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	/**
	 * @return the contactFirstName
	 */
	public String getContactFirstName() {
		return contactFirstName;
	}
	/**
	 * @param contactFirstName the contactFirstName to set
	 */
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the salesRepEmployeeNumber
	 */
	public Long getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	
	/**
	 * @return the creditLimit
	 */
	public Double getCreditLimit() {
		return creditLimit;
	}
	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @param salesRepEmployeeNumber the salesRepEmployeeNumber to set
	 */
	public void setSalesRepEmployeeNumber(Long salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
}
