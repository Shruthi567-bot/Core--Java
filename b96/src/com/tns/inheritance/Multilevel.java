package com.tns.inheritance;

public class Multilevel extends State{

	public static void main(String[] args) {
		State ob=new State();
		ob.setContName("Asia");
		ob.setNoOfCountries(7);
		ob.setContSize(78974152);
		ob.setCountryName("India");
		ob.setNoOfStates(28);
		ob.setCapital("new Delhi");
		ob.setStateName("karnataka");
		ob.setStateCapital("Bangalore");
		ob.setDistrictNo(31);
		System.out.println(ob);
	}


}
