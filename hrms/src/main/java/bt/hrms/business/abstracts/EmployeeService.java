package bt.hrms.business.abstracts;

import java.util.List;

import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAllEmployees();
	Result addEmployee(Employee employee);
}
