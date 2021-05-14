package javaCampCoffeeShop.concretes;

import javaCampCoffeeShop.abstracts.CustomerCheckService;
import javaCampCoffeeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

}
