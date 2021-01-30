package com.appseonit.ems.user.dto;

import java.util.Date;

import com.appseonit.ems.user.util.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;

public class InstituteDTO {

	private Integer instituteId;
	private String instituteName;
	private String instituteCode;
	
	@JsonFormat(pattern = Constants.UI_DATE_FORMAT)
	private Date academicYearFrom;
	
	@JsonFormat(pattern = Constants.UI_DATE_FORMAT)
	private Date academicYearTo;
	
	private String city;
	private String contactNo;
	private String country;
	private String fullAddress;
	private String locality;
	private String mailId;
	private String medium;
	private String officePhoneNo;
	private String pinCode;
	private String recognisedBy;
	private String state;
	
	public InstituteDTO() {}
	
	public InstituteDTO(Integer instituteId, String instituteName, String instituteCode, Date academicYearFrom,
			Date academicYearTo, String city, String contactNo, String country, String fullAddress, String locality,
			String mailId, String medium, String officePhoneNo, String pinCode, String recognisedBy, String state) {
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteCode = instituteCode;
		this.academicYearFrom = academicYearFrom;
		this.academicYearTo = academicYearTo;
		this.city = city;
		this.contactNo = contactNo;
		this.country = country;
		this.fullAddress = fullAddress;
		this.locality = locality;
		this.mailId = mailId;
		this.medium = medium;
		this.officePhoneNo = officePhoneNo;
		this.pinCode = pinCode;
		this.recognisedBy = recognisedBy;
		this.state = state;
	}
	
	public Integer getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getInstituteCode() {
		return instituteCode;
	}
	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}
	public Date getAcademicYearFrom() {
		return academicYearFrom;
	}
	public void setAcademicYearFrom(Date academicYearFrom) {
		this.academicYearFrom = academicYearFrom;
	}
	public Date getAcademicYearTo() {
		return academicYearTo;
	}
	public void setAcademicYearTo(Date academicYearTo) {
		this.academicYearTo = academicYearTo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getOfficePhoneNo() {
		return officePhoneNo;
	}
	public void setOfficePhoneNo(String officePhoneNo) {
		this.officePhoneNo = officePhoneNo;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getRecognisedBy() {
		return recognisedBy;
	}
	public void setRecognisedBy(String recognisedBy) {
		this.recognisedBy = recognisedBy;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
