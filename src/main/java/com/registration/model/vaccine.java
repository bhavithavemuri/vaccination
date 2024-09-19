package com.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vaccine {

	@Id
	private String citizienId;
	private String citizienName;
	private String VaccineName;
	private String VaccineCenterId;
	private String VaccineCenterAdress;
	public vaccine() {
		super();
	}
	public vaccine(String citizienId, String citizienName, String vaccineName, String vaccineCenterId,
			String vaccineCenterAdress) {
		super();
		this.citizienId = citizienId;
		this.citizienName = citizienName;
		VaccineName = vaccineName;
		VaccineCenterId = vaccineCenterId;
		VaccineCenterAdress = vaccineCenterAdress;
	}
	public String getCitizienId() {
		return citizienId;
	}
	public void setCitizienId(String citizienId) {
		this.citizienId = citizienId;
	}
	public String getCitizienName() {
		return citizienName;
	}
	public void setCitizienName(String citizienName) {
		this.citizienName = citizienName;
	}
	public String getVaccineName() {
		return VaccineName;
	}
	public void setVaccineName(String vaccineName) {
		VaccineName = vaccineName;
	}
	public String getVaccineCenterId() {
		return VaccineCenterId;
	}
	public void setVaccineCenterId(String vaccineCenterId) {
		VaccineCenterId = vaccineCenterId;
	}
	public String getVaccineCenterAdress() {
		return VaccineCenterAdress;
	}
	public void setVaccineCenterAdress(String vaccineCenterAdress) {
		VaccineCenterAdress = vaccineCenterAdress;
	}
	@Override
	public String toString() {
		return "vaccine [citizienId=" + citizienId + ", citizienName=" + citizienName + ", VaccineName=" + VaccineName
				+ ", VaccineCenterId=" + VaccineCenterId + ", VaccineCenterAdress=" + VaccineCenterAdress
				+ ", getCitizienId()=" + getCitizienId() + ", getCitizienName()=" + getCitizienName()
				+ ", getVaccineName()=" + getVaccineName() + ", getVaccineCenterId()=" + getVaccineCenterId()
				+ ", getVaccineCenterAdress()=" + getVaccineCenterAdress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
