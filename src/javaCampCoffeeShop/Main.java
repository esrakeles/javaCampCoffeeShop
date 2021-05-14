package javaCampCoffeeShop;

import javaCampCoffeeShop.abstracts.BaseCustomerManager;
import javaCampCoffeeShop.concretes.NeroCustomerManager;
import javaCampCoffeeShop.concretes.StarbucksCustomerManager;
import javaCampCoffeeShop.entities.Customer;
import javaCampCoffeeShop.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer("Engin", "Demiroð", "1985", "28861499108"));
		System.out.println("*-*-*-*-*-*-*-*");
	}

}
