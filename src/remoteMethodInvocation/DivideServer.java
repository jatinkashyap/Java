package remoteMethodInvocation;

import java.rmi.RemoteException;
import java.rmi.server.*;

public class DivideServer extends UnicastRemoteObject implements DivideInterface {
	
	public DivideServer() throws RemoteException {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double divide(double d1, double d2) throws RemoteException {
		double s;
		s=d1/d2;
		return d2;
	}
	
}
