package interface_abstract_demo.Concrete;

import interface_abstract_demo.Abstract.ICustomerCheckService;
import interface_abstract_demo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true; //Bu bizim kontrol servisimiz
	}

}
