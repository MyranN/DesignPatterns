package com.designpatterns.additional.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServiceImpl extends UnicastRemoteObject implements IMyRemoteService {

	private static final long serialVersionUID = 1L;

	public MyRemoteServiceImpl() throws RemoteException{
		
	}
	
	@Override
	public String sayHello() throws RemoteException {
		return "Hello Myran";
	}
	
	public static void main(String[] args) {
		try {
			MyRemoteServiceImpl remoteService = new MyRemoteServiceImpl();
			Naming.rebind("MyRemoteService_Hello", remoteService);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
