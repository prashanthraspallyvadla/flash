package com.se.bo;

public class Agent extends ShipmentEntity {
	
	private String iata;
	private String fmc;
	private String name;
	public Agent(String shipmentEntityName, String identificationNumber, String iata, String fmc, String name) {
		super(shipmentEntityName, identificationNumber);
		this.iata = iata;
		this.fmc = fmc;
		this.name = name;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getFmc() {
		return fmc;
	}
	public void setFmc(String fmc) {
		this.fmc = fmc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display(){
		System.out.format("%-15s %-25s %-15s %-15s %-15s\n",this.shipmentEntityName,this.identificationNumber,this.iata,this.fmc,this.name);
	}

}
