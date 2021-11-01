package Adapters;

import java.rmi.RemoteException;

import interface_abstract_demo.Abstract.ICustomerCheckService;
import interface_abstract_demo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}


//MernisServerReference.KPSPublicSoapClient böyle deðil de
		//KPSPublicSoapClient client = new KPSPublicSoapClient();
		// return client.TCKimlikNoDogrula(customer.NationalityID, customer.FirstName.ToUpper, customer.LastName.ToUpper(), customer.DateOfBirth.Year()); 
		//bunlar yazýlacaktý