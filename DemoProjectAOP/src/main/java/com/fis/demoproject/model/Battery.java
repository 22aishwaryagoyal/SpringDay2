package com.fis.demoproject.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Battery {
	@Value("${battery.name}")
	private String batteryName;
	@Value("500")
	private int power;
	public Battery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Battery(String batteryName, int power) {
		super();
		this.batteryName = batteryName;
		this.power = power;
	}
	public String getBatteryName() {
		return batteryName;
	}
	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Battery [batteryName=" + batteryName + ", power=" + power + "]";
	}
	

}
