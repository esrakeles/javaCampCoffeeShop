package javaCampCoffeeShop.adapters;

import java.rmi.RemoteException;

import javaCampCoffeeShop.abstracts.CustomerCheckService;
import javaCampCoffeeShop.entities.Customer;
import mernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), Integer.parseInt(customer.getDateOfBirth()));
	}

}
