package com.se.Client;

import java.util.Scanner;

import com.se.bo.Agent;
import com.se.bo.Carrier;
import com.se.bo.Company;
import com.se.bo.Customer;
import com.se.bo.ShipmentEntity;

public class Client {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option = 0;
		int n = 0;
		String[] strArr = null;
		String details = null;
		ShipmentEntity se = null;
		Customer cust = null;
		Agent agent = null;
		Company comp = null;
		Carrier carrier = null;
		Customer[] custArr = null;
		Agent[] agentArr = null;
		Company[] compArr = null;
		Carrier[] carrierArr = null;
		System.out.println("enter the noof shipment entity");
		n = s.nextInt();
		custArr = new Customer[n];
		agentArr = new Agent[n];
		compArr = new Company[n];
		carrierArr = new Carrier[n];
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			System.out.println("enter the shipment entity " + j + " details");
			System.out.println("select the shipment entity type");
			System.out.println("1.Customer");
			System.out.println("2.Company");
			System.out.println("3.Agent");
			System.out.println("4.Carrier");
			option = s.nextInt();
			System.out.println("enter the details");
			switch (option) {
			case 1:
				details = s.next();
				strArr = details.split(",");
				cust = new Customer(strArr[0], strArr[1], Integer.parseInt(strArr[2]), strArr[3]);
				custArr[i] = cust;
				break;
			case 2:
				details = s.next();
				strArr = details.split(",");
				comp = new Company(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4]);
				compArr[i] = comp;

				break;
			case 3:
				details = s.next();
				strArr = details.split(",");
				agent = new Agent(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4]);
				agentArr[i] = agent;
				/*for (Agent carrier2 : agentArr) {
					System.out.println(carrier2);
				}*/
				break;
			case 4:
				details = s.next();
				strArr = details.split(",");
				carrier = new Carrier(strArr[0], strArr[1], strArr[2], strArr[3]);
				carrierArr[i] = carrier;
				break;
			default:
				System.out.println("u didnot choose any option");
				break;
			}

		}

		System.out.println("enter the shipment entity type to see the details: ");
		// System.out.println("select the shipment entity type");
		System.out.println("1.Customer");
		System.out.println("2.Company");
		System.out.println("3.Agent");
		System.out.println("4.Carrier");
		option = s.nextInt();	
		switch (option) {
		case 1:
			System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Customer Id",
					"Customer Name");
			for (int j = 0; j < custArr.length; j++) {

				if (custArr[j] != null) {
					custArr[j].display();

				}
			}
			break;

		case 2:
			System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number", "Company Name",
					"IATA", "FMC");
			for (int j = 0; j < compArr.length; j++) {
				if (compArr[j]!= null) {
					compArr[j].display();
				}
			}
			break;
		case 3:
			System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number ", "Agent Name", "IATA",
					"FMC");
			for (int j = 0; j < agentArr.length; j++) {
				if (agentArr[j] != null) {
					agentArr[j].display();
				}
			}
			break;
		case 4:
			System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number", "Code Name", "IATA");
			for (int j = 0; j < carrierArr.length; j++) {
				if (carrierArr[j] != null) {
					carrierArr[j].display();
				}
			}
			break;
		default:
			System.out.println("u didnot choose any option");
			break;
		}
	}

}


//babhnu lorajkhajkd df
