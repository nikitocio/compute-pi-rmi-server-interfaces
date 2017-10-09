package com.server.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author nivanov, <a href="mailto:Nikita.Ivanov@returnonintelligence.com">Ivanov Nikita</a>
 * @since 01-Oct-17
 */
public interface Compute extends Remote{
	<T> T computeTask(Task<T> task) throws RemoteException;
}
