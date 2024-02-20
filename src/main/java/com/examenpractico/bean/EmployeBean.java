package com.examenpractico.bean;

import java.util.Date;

public class EmployeBean {
	private Integer id;
	private Integer genderId;
	private Integer jobId;
	private String name;
	private String lastName;
	private Date birthDate;
	
	private GenderBean genderBean;
	private JobBean jobBean;
	public GenderBean getGenderBean() {
		return genderBean;
	}
	public void setGenderBean(GenderBean genderBean) {
		this.genderBean = genderBean;
	}
	public JobBean getJobBean() {
		return jobBean;
	}
	public void setJobBean(JobBean jobBean) {
		this.jobBean = jobBean;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGenderId() {
		return genderId;
	}
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	
}
