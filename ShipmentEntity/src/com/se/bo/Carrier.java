package com.se.bo;

public class Carrier extends ShipmentEntity{

	private String carrierCode;
	private String iata;
	public Carrier(String shipmentEntityName, String identificationNumber, String carrierCode, String iata) {
		super(shipmentEntityName, identificationNumber);
		this.carrierCode = carrierCode;
		this.iata = iata;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	
	public void display(){
		System.out.format("%-15s %-25s %-15s %-15s %-15s\n",this.shipmentEntityName,this.identificationNumber,this.carrierCode,this.iata);
	}
	
}
