package com.fis.demoproject.model;

public class DeviceType 
{
	private String deviceTypeName;
	private int deviceTypeId;
	private int deviceTypeRating;
	public DeviceType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeviceType(String deviceTypeName, int deviceTypeId,int deviceTypeRating) {
		super();
		this.deviceTypeName = deviceTypeName;
		this.deviceTypeId = deviceTypeId;
		this.deviceTypeRating = deviceTypeRating;
	}
	public String getDeviceTypeName() {
		return deviceTypeName;
	}
	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}
	public int getDeviceTypeId() {
		return deviceTypeId;
	}
	public void setDeviceTypeId(int deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}
	public int getDeviceTypeRating() {
		return deviceTypeRating;
	}
	public void setDeviceTypeRating(int deviceTypeRating) {
		this.deviceTypeRating = deviceTypeRating;
	}
	@Override
	public String toString() {
		return "DeviceType [deviceTypeName=" + deviceTypeName + ", deviceTypeId=" + deviceTypeId + ", deviceTypeRating="
				+ deviceTypeRating + "]";
	}
	
	
}
