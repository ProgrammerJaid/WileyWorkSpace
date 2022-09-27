package com.presentation.constants;

public enum Constants {

	BASE_USAGE(0.50), SECOND_MAX_USAGE(0.75), MAX_USAGE(1.00);

	public double val;

	private Constants(double data) {
		this.val = data;
	}

	public double getPrice() {
		return val;
	}

}
