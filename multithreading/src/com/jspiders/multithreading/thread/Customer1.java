package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Paratha;

public class Customer1 extends Thread {
	private Paratha paratha = new Paratha();

	public Customer1(Paratha paratha) {
		super();
		this.paratha = paratha;
	}

	@Override
	public void run() {

		paratha.orderParatha(8);

	}
}
