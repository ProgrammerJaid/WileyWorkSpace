package com.project.database;

public enum CustomerType {

	RESIDENTIAL(1, "RESIDENTIAL"), COMMERCIAL(2, "COMMERCIAL"), INDUSTRIAL(3, "INDUSTRIAL");

	private int ordinal;
	private String type;

	private CustomerType(int ordinal, String type) {
		this.ordinal = ordinal;
		this.type = type;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public String getType() {
		return type;
	}

}
