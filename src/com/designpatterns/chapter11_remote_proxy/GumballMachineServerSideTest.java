package com.designpatterns.chapter11_remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineServerSideTest {

	public static void main(String[] args) {
		try {
			GumballMachine gumball = new GumballMachine("NYC", 5);
			Naming.rebind("NYC-Gumball", gumball);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
