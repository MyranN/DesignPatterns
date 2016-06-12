package com.designpatterns.additional.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Remote service interface must extend Remote
public interface IMyRemoteService extends Remote{

	public String sayHello() throws RemoteException;
}
