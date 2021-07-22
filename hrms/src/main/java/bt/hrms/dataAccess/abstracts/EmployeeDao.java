package bt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	DataResult<Employee> getByEmail(String email);
}
