package com.fis.demoproject.service;

import org.springframework.stereotype.Component;

import com.fis.demoproject.util.LoggingClass;
import com.fis.demoproject.util.SecurityClass;

@Component
public class ClientService {
	


	public void doBookProduct()
	{
		
		System.out.println(" Product booking code executing .... ");
		
	}
	
	public void doMakePayment()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doMakePayment(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}
	
	
	
}
