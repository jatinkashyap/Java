package remoteMethodInvocation;

import java.rmi.*;

public interface DivideInterface extends Remote{
	double divide(double d1, double d2) throws RemoteException;
}
