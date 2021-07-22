package bt.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

import bt.hrms.entities.concretes.Employee;
import bt.hrms.mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(Employee employee) {
		FakeMernisService client = new FakeMernisService();
		return client.validateByMernis(employee.getFirstName(), employee.getLastName(), employee.getBirthYear(), employee.getTcNumber());
	}

}
