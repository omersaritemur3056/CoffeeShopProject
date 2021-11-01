package interface_abstract_demo.Concrete;

import interface_abstract_demo.Abstract.BaseCustomerManager;
import interface_abstract_demo.Abstract.ICustomerCheckService;
import interface_abstract_demo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person"); //throw new Exception vardý burada ve else bloðu içindeydi 
		}
		
	}


}
