package jrout.tutorial.java.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {

	public static void main(String[] args) throws RemoteException , Exception {
		Registry registry = LocateRegistry.getRegistry("localhost",1223);
		IEmployee emp = (IEmployee)registry.lookup("EmployeeDetails");
		String empName = emp.getEmployeeName(100);
		System.out.println(empName);

	}

}
