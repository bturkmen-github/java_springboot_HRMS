package bt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.hrms.business.abstracts.EmployeeService;
import bt.hrms.core.utilities.adapters.ValidationService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.ErrorResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.core.utilities.results.SuccessDataResult;
import bt.hrms.core.utilities.results.SuccessResult;
import bt.hrms.dataAccess.abstracts.EmployeeDao;
import bt.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
	private EmployeeDao employeeDao;
	private ValidationService validationService;

	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,ValidationService validationService) {
		this.employeeDao = employeeDao;
		this.validationService=validationService;
	}

	@Override
	public DataResult<List<Employee>> getAllEmployees() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"İş Arayanlar Listelendi");
	}

	@Override
	public Result addEmployee(Employee employee) {
		
		if(validationService.validateByMernis(employee)) {
			this.employeeDao.save(employee);
			return new SuccessResult("Employee Eklendi");			
		}else {
			return new ErrorResult("Mernis Doğrulamasından Geçemedi");
		}
				
	}

}
