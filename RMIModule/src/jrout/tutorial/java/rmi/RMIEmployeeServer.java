package jrout.tutorial.java.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIEmployeeServer {

	public static void main(String[] args) throws RemoteException {
		EmployeeImpl impl = new EmployeeImpl();
		
		Registry registry = LocateRegistry.createRegistry(1223);
		registry.rebind("EmployeeDetails", impl);
		System.out.println("Object is been registred..and server is started....");
	}

}
