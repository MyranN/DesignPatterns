package com.designpatterns.additional.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteServiceClient {

	public static void main(String[] args) {
		new MyRemoteServiceClient().go(); 
	}
	
	public void go() {
		
		try {
			IMyRemoteService remoteService = (IMyRemoteService) Naming.lookup("rmi://127.0.0.1/MyRemoteService_Hello");
			String result = remoteService.sayHello();
			System.out.println(result);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
