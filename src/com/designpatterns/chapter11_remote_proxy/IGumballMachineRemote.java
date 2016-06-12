package com.designpatterns.chapter11_remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGumballMachineRemote extends Remote{
	
	//All return types in RMI should be primitive or Serializable
	public String getLocation() throws RemoteException;
	
	public int getCount() throws RemoteException;
}
