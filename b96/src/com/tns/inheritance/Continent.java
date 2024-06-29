package com.tns.inheritance;

public class Continent {
	private String ContName;
	private int NoOfCountries;
	private float ContSize;

	//constructor of the variables
	public Continent(String contName, int noOfCountries, float contSize) {
		super();
		ContName = contName;
		NoOfCountries = noOfCountries;
		ContSize = contSize;
	}

	//default constructor
	public Continent() {
		super();
	}

	//to string
	@Override
	public String toString() {
		return "Continent [ContName=" + ContName + ", NoOfCountries=" + NoOfCountries + ", ContSize=" + ContSize + "]";
	}

	//the getters and setters
	public String getContName() {
		return ContName;
	}
	public void setContName(String contName) {
		ContName = contName;
	}
	public int getNoOfCountries() {
		return NoOfCountries;
	}
	public void setNoOfCountries(int noOfCountries) {
		NoOfCountries = noOfCountries;
	}
	public float getContSize() {
		return ContSize;
	}
	public void setContSize(float contSize) {
		ContSize = contSize;
	}

}