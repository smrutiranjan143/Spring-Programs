package com.bb.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motor {
	@Autowired
	private FuelTank fuelTank;

	@Override
	public String toString() {
		return "Motor [fuelTank=" + fuelTank + "]";
	}

}
