package javaCampCoffeeShop.abstracts;

import java.rmi.RemoteException;

import javaCampCoffeeShop.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws Exception, RemoteException;
}
