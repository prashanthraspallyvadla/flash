package com.ss;

import java.util.Scanner;

public class StringSearch {
	public static void main(String args[]){
		
		String[] carr=null;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the noof customers");
		int n=s.nextInt();
		carr=new String[n];
		System.out.println("enter the customers name");
		for (int i = 0; i <n; i++) {
			String name=s.next();
			carr[i]=name;
			
		}
		
		System.out.println("enter the name you want to search");
		String searchName=s.next();
		//int j=0;
		
		/*for (int i = 0; i < carr.length; i++) {
			if(searchName==carr[i]){
				System.out.println(carr[i]+" is found");
				
			}
			else{
				System.out.println(carr[i]+ " not found");
			}
			
			
		}*/
		boolean contains=false;
		for(String string : carr) {
			if(searchName.equals(string)){
				
				contains=true;
				break;
			}
			
		}
		
		if(contains){
			System.out.println(searchName+" found");
		}else{
			System.out.println(searchName+" not  found");
		}
		
		
		/*for (String string : carr) {
			System.out.println(string);	
		}
		*/
		
		
		
		
		
		
		
		
	}
}
