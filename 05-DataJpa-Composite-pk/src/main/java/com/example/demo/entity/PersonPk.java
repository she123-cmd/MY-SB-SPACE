package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPk {

	 private Integer personId;
	 
	 private String passPortNum;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPassPortNum() {
		return passPortNum;
	}

	public void setPassPortNum(String passPortNum) {
		this.passPortNum = passPortNum;
	}

	@Override
	public String toString() {
		return "PersonPk [personId=" + personId + ", passPortNum=" + passPortNum + "]";
	}
	 
	 
}
