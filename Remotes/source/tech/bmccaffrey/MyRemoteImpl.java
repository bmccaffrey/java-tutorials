package tech.bmccaffrey;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public MyRemoteImpl() throws RemoteException {
	}

	public static void main(String[] args) {

		try {
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("Remote Hello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public String sayHello() {
		return "Your Server says, 'Hello.'";
	}

}