package interface_abstract_demo.Abstract;

import interface_abstract_demo.Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
