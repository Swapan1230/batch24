package jrout.tutorial.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EmployeeImpl extends UnicastRemoteObject implements IEmployee {

	protected EmployeeImpl() throws RemoteException {
		super();
	}

	@Override
	public String getEmployeeName(int empno) throws RemoteException {
		return "Hello Your Employee number is " + empno;
	}

}
