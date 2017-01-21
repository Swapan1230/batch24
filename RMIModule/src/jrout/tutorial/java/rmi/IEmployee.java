package jrout.tutorial.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployee extends Remote{
	public String getEmployeeName(int empno) throws RemoteException;
}
