package com.designpatterns.chapter11_remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorMain {

	public static void main(String[] args) {
		
		try {
			GumballMachine gumballMachine = (GumballMachine)Naming.lookup("rmi://127.0.0.1/NYC-Gumball");
			GumballMonitor monitor = new GumballMonitor(gumballMachine);
			monitor.report();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
