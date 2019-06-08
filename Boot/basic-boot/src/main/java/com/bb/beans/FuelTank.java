package com.bb.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app-values.properties")
public class FuelTank {
	@Value("${fuelTankNo}")
	protected int fuelTankNo;
	@Value("${fuelType}")
	protected String fuelType;
	@Value("${capacity}")
	protected int capacity;

	public int getFuelTankNo() {
		return fuelTankNo;
	}

	public void setFuelTankNo(int fuelTankNo) {
		this.fuelTankNo = fuelTankNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelTankNo=" + fuelTankNo + ", fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
