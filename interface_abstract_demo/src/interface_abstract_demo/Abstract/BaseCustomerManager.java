package interface_abstract_demo.Abstract;

import interface_abstract_demo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
		
	}

}
