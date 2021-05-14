package javaCampCoffeeShop.concretes;

import javaCampCoffeeShop.abstracts.BaseCustomerManager;
import javaCampCoffeeShop.abstracts.CustomerCheckService;
import javaCampCoffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception{
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
		
	}
	
}
