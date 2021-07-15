package com.fis.demoproject.model;

import org.springframework.stereotype.Component;

@Component
public class ElectronicsHub 
{
	private ElectronicDevice electronics;
	private Merchant merchant;
	private String operatorName;
	private int hubId;
	public ElectronicsHub() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicsHub(ElectronicDevice electronics, Merchant merchant, String operatorName, int hubId) {
		super();
		this.electronics = electronics;
		this.merchant = merchant;
		this.operatorName = operatorName;
		this.hubId = hubId;
	}
	public ElectronicDevice getElectronics() {
		return electronics;
	}
	public void setElectronics(ElectronicDevice electronics) {
		this.electronics = electronics;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public int getHubId() {
		return hubId;
	}
	public void setHubId(int hubId) {
		this.hubId = hubId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((electronics == null) ? 0 : electronics.hashCode());
		result = prime * result + hubId;
		result = prime * result + ((merchant == null) ? 0 : merchant.hashCode());
		result = prime * result + ((operatorName == null) ? 0 : operatorName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicsHub other = (ElectronicsHub) obj;
		if (electronics == null) {
			if (other.electronics != null)
				return false;
		} else if (!electronics.equals(other.electronics))
			return false;
		if (hubId != other.hubId)
			return false;
		if (merchant == null) {
			if (other.merchant != null)
				return false;
		} else if (!merchant.equals(other.merchant))
			return false;
		if (operatorName == null) {
			if (other.operatorName != null)
				return false;
		} else if (!operatorName.equals(other.operatorName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ElectronicsHub [electronics=" + electronics + ", merchant=" + merchant + ", operatorName="
				+ operatorName + ", hubId=" + hubId + "]";
	}
	
}
