package com.designpatterns.chapter11_remote_proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements IGumballMachineRemote{

	private static final long serialVersionUID = 1L;
	private String location;
	private int count;
	
	public GumballMachine(String location, int count) throws RemoteException {
		this.location = location;
		this.count = count;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getCount() {
		return count;
	}
}
