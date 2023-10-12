package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Paratha;
import com.jspiders.multithreading.thread.Customer;
import com.jspiders.multithreading.thread.Resto;
import com.jspiders.multithreading.thread.Customer1;

public class ParathaMain {
	public static void main(String[] args) {

		Paratha paratha = new Paratha();

		Customer customer = new Customer(paratha);
		Customer1 customer1 = new Customer1(paratha);
		
		Resto resto = new Resto(paratha);

		customer.start();
		customer1.start();
		resto.start();

	}
	
}
