package com.fis.demoproject.model;

import org.springframework.stereotype.Component;

@Component
public class Merchant
{
	private String merchantName;
	private int id;
	private int starRating;
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Merchant(String merchantName, int id, int starRating) {
		super();
		this.merchantName = merchantName;
		this.id = id;
		this.starRating = starRating;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((merchantName == null) ? 0 : merchantName.hashCode());
		result = prime * result + starRating;
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
		Merchant other = (Merchant) obj;
		if (id != other.id)
			return false;
		if (merchantName == null) {
			if (other.merchantName != null)
				return false;
		} else if (!merchantName.equals(other.merchantName))
			return false;
		if (starRating != other.starRating)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Merchant [merchantName=" + merchantName + ", id=" + id + ", starRating=" + starRating + "]";
	}
	
}
