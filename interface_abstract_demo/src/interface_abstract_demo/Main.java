package interface_abstract_demo;

import Adapters.MernisServiceAdapters;
import interface_abstract_demo.Abstract.BaseCustomerManager;
import interface_abstract_demo.Concrete.NeroCustomerManager;
import interface_abstract_demo.Concrete.StarbucksCustomerManager;
import interface_abstract_demo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setFirstName("Ömer");
		customer.setLastName("Sarýtemur");
		customer.setId(1);
		customer.setYearOfBirth(1992);
		customer.setNationalityId("11111111111");
		
		neroCustomerManager.save(customer);
		starbucksCustomerManager.save(customer);
	}

}
