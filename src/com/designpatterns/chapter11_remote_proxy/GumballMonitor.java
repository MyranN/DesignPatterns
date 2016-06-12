package com.designpatterns.chapter11_remote_proxy;

import java.rmi.RemoteException;

public class GumballMonitor {

	IGumballMachineRemote gumballMachine;
	
	public GumballMonitor(IGumballMachineRemote gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void report() {
		try {
			System.out.println("Gumball Machine: " + gumballMachine.getLocation());
			System.out.println("Current Inventory: " + gumballMachine.getCount() + " gumball(s)");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
